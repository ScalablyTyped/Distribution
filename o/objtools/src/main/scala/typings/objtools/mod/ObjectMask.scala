package typings.objtools.mod

import typings.objtools.objtoolsBooleans.`false`
import typings.objtools.objtoolsBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objtools", "ObjectMask")
@js.native
class ObjectMask protected () extends js.Object {
  /**
    * Creates an ObjectMask.
    * @param mask The data for the mask
    */
  def this(mask: Mask) = this()
  /**
    * Adds a field to a filter. If the filter already matches, the method is a
    * no-op.
    * @param path - the dotted path to the field to add
    * @returns returns self
    */
  def addField(path: String): this.type = js.native
  /**
    * Given a dot-notation mapping from fields to values (only 1 level deep is
    * checked), ensure that all fields are in the (structured) mask.
    * @param dottedObj - Mapping from dot-separated paths to values
    * @returns The check result.
    */
  def checkDottedFields(dottedObj: Record[String, _]): Boolean = js.native
  /**
    * Given a structured document, ensures that all fields are allowed by the
    * given mask. Returns true or false.
    * @param obj - Object to check.
    * @returns The check result
    */
  def checkFields(obj: Record[String, _]): Boolean = js.native
  /**
    * Returns true if the given path is allowed by the mask. false otherwise.
    * @param path - Dot-separated path
    * @returns Whether or not the given path is allowed
    */
  def checkPath(path: String): Boolean = js.native
  /**
    * Returns a function that filters object fields based on a structured
    * mask/whitelist.
    * @returns A function(obj) that is the equivalent of callingfilterObject()
    * on obj.
    */
  def createFilterFunc(): js.Function1[/* obj */ Record[String, _], Record[String, _]] = js.native
  /**
    * Given a dot-notation mapping from fields to values, remove all fields
    * that are not allowed by the mask.
    * @param dottedObj - Map from dotted paths to values, such as
    *   { "foo.bar": "baz" }
    * @param maskedOutHook - Function to call for removed fields
    * @returns The result
    */
  def filterDottedObject(dottedObj: Record[String, _]): Record[String, _] = js.native
  def filterDottedObject(dottedObj: Record[String, _], maskedOutHook: MaskedOutHook): Record[String, _] = js.native
  /**
    * Returns a copy of the given object, but only including the fields allowed
    * by the mask.
    *
    * @remarks
    * If the maskedOutHook function is provided, it is called for each field
    * disallowed by the mask (at the highest level it is disallowed).
    *
    * @param obj - Object to filter
    * @param maskedOutHook - Function to call for fields disallowed
    * by the mask
    */
  def filterObject(obj: Record[String, _]): Record[String, _] = js.native
  def filterObject(obj: Record[String, _], maskedOutHook: MaskedOutHook): Record[String, _] = js.native
  /**
    * Returns an array of fields in the given object which are restricted by
    * the given mask. The object is in dotted notation as in
    * filterDottedObject()
    * @param obj - The object to check against
    * @returns Paths to fields that are restricted by the mask
    */
  def getDottedMaskedOutFields(obj: Record[String, _]): js.Array[String] = js.native
  /**
    * Returns an array of fields in the given object which are restricted by
    * the given mask
    * @param obj - The object to check against
    * @returns Paths to fields that are restricted by the mask
    */
  def getMaskedOutFields(obj: Record[String, _]): js.Array[String] = js.native
  /**
    * Returns a subsection of a mask given a dot-separated path to the
    * subsection.
    * @param path - Dot-separated path to submask to fetch
    * @returns Mask component corresponding to the path
    */
  def getSubMask(path: String): ObjectMask = js.native
  /**
    * Removes a field from a filter. If the mask already does not match, the
    * method is a no-op.
    * @param path - the dotted path to the field to remove
    * @returns returns self
    */
  def removeField(path: String): this.type = js.native
  def subtractMask(mask: Mask): ObjectMask = js.native
  /**
    * Subtracts a mask.
    * @param mask - the mask to subtract
    * @returns the new mask
    */
  def subtractMask(mask: ObjectMask): ObjectMask = js.native
  /**
    * Returns the internal object that represents this mask.
    * @returns Object representation of this mask
    */
  def toObject(): Mask = js.native
  /**
    * Check if a mask is valid in strict form (ie, it only contains objects and
    * booleans)
    * @return Whether or not the mask is strictly valid
    */
  def validate(): Boolean = js.native
}

/* static members */
@JSImport("objtools", "ObjectMask")
@js.native
object ObjectMask extends js.Object {
  /**
    * Combines two or more masks such that the result mask matches fields
    * matched by any of the combined masks.
    * @param masks - Mask data or ObjectMask instances ot add.
    * @returns The result of adding together the component masks. Will be
    *   `true` if either of the masks is `true` or an ObjectMask wrapping
    *   `true`.
    */
  def addMasks(masks: (ObjectMask | Mask)*): ObjectMask | `true` = js.native
  /**
    * Adds a set of masks together, but using a logical AND instead of a
    * logical OR (as in addMasks). IE, a field must be allowed in all given
    * masks to be in the result mask.
    * @param masks - Mask data or ObjectMask instances.
    * @returns The result of ANDing together the component masks. Will be
    *   `false` if the result would be an empty mask.
    */
  def andMasks(masks: (ObjectMask | Mask)*): ObjectMask | `false` = js.native
  /**
    * Creates a structured mask given a list of fields that should be included
    * in the mask.
    * @param fields - Array of fields to include
    * @returns The created mask
    */
  def createMaskFromFieldList(fields: js.Array[String]): ObjectMask = js.native
  def invertMask(mask: Mask): ObjectMask = js.native
  /**
    * Inverts a mask. The resulting mask disallows all fields previously
    * allowed, and allows all fields previously disallowed.
    * @param - the mask to invert
    * @returns the inverted mask
    */
  def invertMask(mask: ObjectMask): ObjectMask = js.native
  def isObjectMask(mask: Mask): Boolean = js.native
  /**
    * Check if an object is an ObjectMask
    * @param obj - the object to determine if is an ObjectMask
    * @returns true if obj is an ObjectMask, false otherwise
    */
  def isObjectMask(mask: ObjectMask): Boolean = js.native
  def subtractMasks(min: Mask, sub: Mask): ObjectMask = js.native
  def subtractMasks(min: Mask, sub: ObjectMask): ObjectMask = js.native
  def subtractMasks(min: ObjectMask, sub: Mask): ObjectMask = js.native
  /**
    * Combines two or more masks such that the result mask matches fields
    * matched by the first mask but not the second
    * @param min - the minuend
    * @param sub - the subtrahend
    * @returns The result of subtracting the second mask from the first
    */
  def subtractMasks(min: ObjectMask, sub: ObjectMask): ObjectMask = js.native
}

