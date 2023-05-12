package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbStrings.nearest
import typings.mongodb.mongodbStrings.primary
import typings.mongodb.mongodbStrings.primaryPreferred
import typings.mongodb.mongodbStrings.secondary
import typings.mongodb.mongodbStrings.secondaryPreferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ReadPreference")
@js.native
open class ReadPreference protected ()
  extends StObject
     with ReadPreferenceLike {
  /**
    * @param mode - A string describing the read preference mode (primary|primaryPreferred|secondary|secondaryPreferred|nearest)
    * @param tags - A tag set used to target reads to members with the specified tag(s). tagSet is not available if using read preference mode primary.
    * @param options - Additional read preference options
    */
  def this(mode: ReadPreferenceMode) = this()
  def this(mode: ReadPreferenceMode, tags: js.Array[TagSet]) = this()
  def this(mode: ReadPreferenceMode, tags: js.Array[TagSet], options: ReadPreferenceOptions) = this()
  def this(mode: ReadPreferenceMode, tags: Unit, options: ReadPreferenceOptions) = this()
  
  /**
    * Check if the two ReadPreferences are equivalent
    *
    * @param readPreference - The read preference with which to check equality
    */
  def equals(readPreference: ReadPreference): Boolean = js.native
  
  var hedge: js.UndefOr[HedgeOptions] = js.native
  
  /**
    * Validate if a mode is legal
    *
    * @param mode - The string representing the read preference mode.
    */
  def isValid(): Boolean = js.native
  def isValid(mode: String): Boolean = js.native
  
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
  
  var minWireVersion: js.UndefOr[scala.Double] = js.native
  
  var mode: ReadPreferenceMode = js.native
  
  def preference: ReadPreferenceMode = js.native
  
  /**
    * Indicates that this readPreference needs the "SecondaryOk" bit when sent over the wire
    * @see https://www.mongodb.com/docs/manual/reference/mongodb-wire-protocol/#op-query
    */
  def secondaryOk(): Boolean = js.native
  
  var tags: js.UndefOr[js.Array[TagSet]] = js.native
  
  /** Return JSON representation */
  def toJSON(): Document = js.native
}
/* static members */
object ReadPreference {
  
  @JSImport("mongodb", "ReadPreference")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "ReadPreference.NEAREST")
  @js.native
  def NEAREST: nearest = js.native
  inline def NEAREST_=(x: nearest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEAREST")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.PRIMARY")
  @js.native
  def PRIMARY: primary = js.native
  inline def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.PRIMARY_PREFERRED")
  @js.native
  def PRIMARY_PREFERRED: primaryPreferred = js.native
  inline def PRIMARY_PREFERRED_=(x: primaryPreferred): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.SECONDARY")
  @js.native
  def SECONDARY: secondary = js.native
  inline def SECONDARY_=(x: secondary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.SECONDARY_PREFERRED")
  @js.native
  def SECONDARY_PREFERRED: secondaryPreferred = js.native
  inline def SECONDARY_PREFERRED_=(x: secondaryPreferred): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  /**
    * Construct a ReadPreference given an options object.
    *
    * @param options - The options object from which to extract the read preference.
    */
  inline def fromOptions(): js.UndefOr[ReadPreference] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")().asInstanceOf[js.UndefOr[ReadPreference]]
  inline def fromOptions(options: ReadPreferenceFromOptions): js.UndefOr[ReadPreference] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReadPreference]]
  
  inline def fromString(mode: String): ReadPreference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(mode.asInstanceOf[js.Any]).asInstanceOf[ReadPreference]
  
  /**
    * Validate if a mode is legal
    *
    * @param mode - The string representing the read preference mode.
    */
  inline def isValid(mode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("mongodb", "ReadPreference.nearest")
  @js.native
  def nearest: ReadPreference = js.native
  inline def nearest_=(x: ReadPreference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nearest")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.primary")
  @js.native
  def primary: ReadPreference = js.native
  
  @JSImport("mongodb", "ReadPreference.primaryPreferred")
  @js.native
  def primaryPreferred: ReadPreference = js.native
  inline def primaryPreferred_=(x: ReadPreference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryPreferred")(x.asInstanceOf[js.Any])
  
  inline def primary_=(x: ReadPreference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primary")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.secondary")
  @js.native
  def secondary: ReadPreference = js.native
  
  @JSImport("mongodb", "ReadPreference.secondaryPreferred")
  @js.native
  def secondaryPreferred: ReadPreference = js.native
  inline def secondaryPreferred_=(x: ReadPreference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryPreferred")(x.asInstanceOf[js.Any])
  
  inline def secondary_=(x: ReadPreference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondary")(x.asInstanceOf[js.Any])
  
  /**
    * Replaces options.readPreference with a ReadPreference instance
    */
  inline def translate(options: ReadPreferenceLikeOptions): ReadPreferenceLikeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(options.asInstanceOf[js.Any]).asInstanceOf[ReadPreferenceLikeOptions]
}
