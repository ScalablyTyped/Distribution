package typings.objtools

import org.scalablytyped.runtime.StringDictionary
import typings.objtools.objtoolsBooleans.`false`
import typings.objtools.objtoolsBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("objtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("objtools", "ObjectMask")
  @js.native
  open class ObjectMask protected () extends StObject {
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
    def checkDottedFields(dottedObj: Record[String, Any]): Boolean = js.native
    
    /**
      * Given a structured document, ensures that all fields are allowed by the
      * given mask. Returns true or false.
      * @param obj - Object to check.
      * @returns The check result
      */
    def checkFields(obj: Record[String, Any]): Boolean = js.native
    
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
    def createFilterFunc(): js.Function1[/* obj */ Record[String, Any], Record[String, Any]] = js.native
    
    /**
      * Given a dot-notation mapping from fields to values, remove all fields
      * that are not allowed by the mask.
      * @param dottedObj - Map from dotted paths to values, such as
      *   { "foo.bar": "baz" }
      * @param maskedOutHook - Function to call for removed fields
      * @returns The result
      */
    def filterDottedObject(dottedObj: Record[String, Any]): Record[String, Any] = js.native
    def filterDottedObject(dottedObj: Record[String, Any], maskedOutHook: MaskedOutHook): Record[String, Any] = js.native
    
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
    def filterObject(obj: Record[String, Any]): Record[String, Any] = js.native
    def filterObject(obj: Record[String, Any], maskedOutHook: MaskedOutHook): Record[String, Any] = js.native
    
    /**
      * Returns an array of fields in the given object which are restricted by
      * the given mask. The object is in dotted notation as in
      * filterDottedObject()
      * @param obj - The object to check against
      * @returns Paths to fields that are restricted by the mask
      */
    def getDottedMaskedOutFields(obj: Record[String, Any]): js.Array[String] = js.native
    
    /**
      * Returns an array of fields in the given object which are restricted by
      * the given mask
      * @param obj - The object to check against
      * @returns Paths to fields that are restricted by the mask
      */
    def getMaskedOutFields(obj: Record[String, Any]): js.Array[String] = js.native
    
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
  object ObjectMask {
    
    @JSImport("objtools", "ObjectMask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two or more masks such that the result mask matches fields
      * matched by any of the combined masks.
      * @param masks - Mask data or ObjectMask instances ot add.
      * @returns The result of adding together the component masks. Will be
      *   `true` if either of the masks is `true` or an ObjectMask wrapping
      *   `true`.
      */
    inline def addMasks(masks: (ObjectMask | Mask)*): ObjectMask | `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("addMasks")(masks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ObjectMask | `true`]
    
    /**
      * Adds a set of masks together, but using a logical AND instead of a
      * logical OR (as in addMasks). IE, a field must be allowed in all given
      * masks to be in the result mask.
      * @param masks - Mask data or ObjectMask instances.
      * @returns The result of ANDing together the component masks. Will be
      *   `false` if the result would be an empty mask.
      */
    inline def andMasks(masks: (ObjectMask | Mask)*): ObjectMask | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("andMasks")(masks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ObjectMask | `false`]
    
    /**
      * Creates a structured mask given a list of fields that should be included
      * in the mask.
      * @param fields - Array of fields to include
      * @returns The created mask
      */
    inline def createMaskFromFieldList(fields: js.Array[String]): ObjectMask = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaskFromFieldList")(fields.asInstanceOf[js.Any]).asInstanceOf[ObjectMask]
    
    inline def invertMask(mask: Mask): ObjectMask = ^.asInstanceOf[js.Dynamic].applyDynamic("invertMask")(mask.asInstanceOf[js.Any]).asInstanceOf[ObjectMask]
    /**
      * Inverts a mask. The resulting mask disallows all fields previously
      * allowed, and allows all fields previously disallowed.
      * @param - the mask to invert
      * @returns the inverted mask
      */
    inline def invertMask(mask: ObjectMask): ObjectMask = ^.asInstanceOf[js.Dynamic].applyDynamic("invertMask")(mask.asInstanceOf[js.Any]).asInstanceOf[ObjectMask]
    
    inline def isObjectMask(mask: Mask): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMask")(mask.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    /**
      * Check if an object is an ObjectMask
      * @param obj - the object to determine if is an ObjectMask
      * @returns true if obj is an ObjectMask, false otherwise
      */
    inline def isObjectMask(mask: ObjectMask): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectMask")(mask.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def subtractMasks(min: Mask, sub: Mask): ObjectMask = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractMasks")(min.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[ObjectMask]
    inline def subtractMasks(min: Mask, sub: ObjectMask): ObjectMask = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractMasks")(min.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[ObjectMask]
    inline def subtractMasks(min: ObjectMask, sub: Mask): ObjectMask = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractMasks")(min.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[ObjectMask]
    /**
      * Combines two or more masks such that the result mask matches fields
      * matched by the first mask but not the second
      * @param min - the minuend
      * @param sub - the subtrahend
      * @returns The result of subtracting the second mask from the first
      */
    inline def subtractMasks(min: ObjectMask, sub: ObjectMask): ObjectMask = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractMasks")(min.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[ObjectMask]
  }
  
  inline def collapseToDotted(obj: Record[String, Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseToDotted")(obj.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def collapseToDotted(obj: Record[String, Any], includeRedundantLevels: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToDotted")(obj.asInstanceOf[js.Any], includeRedundantLevels.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def collapseToDotted(obj: Record[String, Any], includeRedundantLevels: Boolean, stopAtArrays: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToDotted")(obj.asInstanceOf[js.Any], includeRedundantLevels.asInstanceOf[js.Any], stopAtArrays.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def collapseToDotted(obj: Record[String, Any], includeRedundantLevels: Unit, stopAtArrays: Boolean): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToDotted")(obj.asInstanceOf[js.Any], includeRedundantLevels.asInstanceOf[js.Any], stopAtArrays.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def deepCopy(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deletePath(obj: Record[String, Any], path: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deletePath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def diffObjects(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def diffObjects_Record(objects: (Record[String, Any])*): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Record[String, Any]]
  
  inline def dottedDiff(val1: Any, val2: Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("dottedDiff")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getDuplicates(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDuplicates")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getPath(obj: Record[String, Any], path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPath(obj: Record[String, Any], path: String, allowSkipArrays: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], allowSkipArrays.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isEmpty(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyArray(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyObject(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isScalar(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTerminal(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerminal")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchDottedObject(doc: Record[String, Any], query: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchDottedObject")(doc.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchObject(doc: Record[String, Any], query: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchObject")(doc.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def merge(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def merge[TTarget, TSource](target: TTarget, source: TSource): TTarget & TSource = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource]
  inline def merge[TTarget, TSource](target: TTarget, source: TSource, customizer: MergeCustomizer): TTarget & TSource = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource]
  inline def merge[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget & TSource1 & TSource2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2]
  inline def merge[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2, customizer: MergeCustomizer): TTarget & TSource1 & TSource2 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2]
  inline def merge[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget & TSource1 & TSource2 & TSource3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3]
  inline def merge[TTarget, TSource1, TSource2, TSource3](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeCustomizer
  ): TTarget & TSource1 & TSource2 & TSource3 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3]
  inline def merge[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget & TSource1 & TSource2 & TSource3 & TSource4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3 & TSource4]
  inline def merge[TTarget, TSource1, TSource2, TSource3, TSource4](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeCustomizer
  ): TTarget & TSource1 & TSource2 & TSource3 & TSource4 = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3 & TSource4]
  
  inline def mergeHeavy(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def mergeHeavy[TTarget, TSource](target: TTarget, source: TSource): TTarget & TSource = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource]
  inline def mergeHeavy[TTarget, TSource](target: TTarget, source: TSource, customizer: MergeCustomizer): TTarget & TSource = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource]
  inline def mergeHeavy[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget & TSource1 & TSource2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2]
  inline def mergeHeavy[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2, customizer: MergeCustomizer): TTarget & TSource1 & TSource2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2]
  inline def mergeHeavy[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget & TSource1 & TSource2 & TSource3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3]
  inline def mergeHeavy[TTarget, TSource1, TSource2, TSource3](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeCustomizer
  ): TTarget & TSource1 & TSource2 & TSource3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3]
  inline def mergeHeavy[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget & TSource1 & TSource2 & TSource3 & TSource4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3 & TSource4]
  inline def mergeHeavy[TTarget, TSource1, TSource2, TSource3, TSource4](
    target: TTarget,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeCustomizer
  ): TTarget & TSource1 & TSource2 & TSource3 & TSource4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeHeavy")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any], customizer.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3 & TSource4]
  
  inline def mergeLight(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeLight")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  inline def mergeLight[TTarget, TSource](target: TTarget, source: TSource): TTarget & TSource = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLight")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource]
  inline def mergeLight[TTarget, TSource1, TSource2](target: TTarget, source1: TSource1, source2: TSource2): TTarget & TSource1 & TSource2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLight")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2]
  inline def mergeLight[TTarget, TSource1, TSource2, TSource3](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3): TTarget & TSource1 & TSource2 & TSource3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLight")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3]
  inline def mergeLight[TTarget, TSource1, TSource2, TSource3, TSource4](target: TTarget, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TTarget & TSource1 & TSource2 & TSource3 & TSource4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLight")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any])).asInstanceOf[TTarget & TSource1 & TSource2 & TSource3 & TSource4]
  
  inline def objectHash(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectHash")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sanitizeDate(value: Any): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
  
  inline def scalarEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setPath(obj: Record[String, Any], path: String, value: Any): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def syncObject(toObj: Record[String, Any], fromObj: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncObject")(toObj.asInstanceOf[js.Any], fromObj.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def syncObject(toObj: Record[String, Any], fromObj: Record[String, Any], options: SyncObjectOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncObject")(toObj.asInstanceOf[js.Any], fromObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  type Mask = MaskObj | js.Array[MaskObj] | Boolean
  
  trait MaskObj
    extends StObject
       with /* key */ StringDictionary[Mask]
  object MaskObj {
    
    inline def apply(): MaskObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskObj]
    }
  }
  
  type MaskedOutHook = js.Function1[/* path */ String, Unit]
  
  type MergeCustomizer = js.Function4[/* objectValue */ Any, /* sourceValue */ Any, /* key */ String, /* object */ Any, Any]
  
  type OnFieldHook = js.Function4[
    /* field */ String, 
    /* toVal */ Any, 
    /* fromVal */ Any, 
    /* parentObj */ Record[String, Any], 
    Any
  ]
  
  trait SyncObjectOptions extends StObject {
    
    /**
      * Optional function to be called when a value changes.
      */
    def onChange(field: String, toVal: Any, fromVal: Any, parentObj: Record[String, Any]): Any
    /**
      * Optional function to be called when a value changes.
      */
    @JSName("onChange")
    var onChange_Original: OnFieldHook
    
    /**
      * An optional callback to call whenever a field is traversed during this
      * function.  If it returns a boolean `false`, any modification is prevented
      * and further subfields will not be traversed.
      */
    def onField(field: String, toVal: Any, fromVal: Any, parentObj: Record[String, Any]): Any
    /**
      * An optional callback to call whenever a field is traversed during this
      * function.  If it returns a boolean `false`, any modification is prevented
      * and further subfields will not be traversed.
      */
    @JSName("onField")
    var onField_Original: OnFieldHook
  }
  object SyncObjectOptions {
    
    inline def apply(
      onChange: (/* field */ String, /* toVal */ Any, /* fromVal */ Any, /* parentObj */ Record[String, Any]) => Any,
      onField: (/* field */ String, /* toVal */ Any, /* fromVal */ Any, /* parentObj */ Record[String, Any]) => Any
    ): SyncObjectOptions = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction4(onChange), onField = js.Any.fromFunction4(onField))
      __obj.asInstanceOf[SyncObjectOptions]
    }
    
    extension [Self <: SyncObjectOptions](x: Self) {
      
      inline def setOnChange(
        value: (/* field */ String, /* toVal */ Any, /* fromVal */ Any, /* parentObj */ Record[String, Any]) => Any
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnField(
        value: (/* field */ String, /* toVal */ Any, /* fromVal */ Any, /* parentObj */ Record[String, Any]) => Any
      ): Self = StObject.set(x, "onField", js.Any.fromFunction4(value))
    }
  }
}
