package typings.mongodb.mod

import typings.mongodb.mongodbStrings.nearest
import typings.mongodb.mongodbStrings.primary
import typings.mongodb.mongodbStrings.primaryPreferred
import typings.mongodb.mongodbStrings.secondary
import typings.mongodb.mongodbStrings.secondaryPreferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ReadPreference")
@js.native
class ReadPreference protected () extends ReadPreferenceOrMode {
  def this(mode: ReadPreferenceMode, tags: js.Object) = this()
  def this(mode: ReadPreferenceMode, tags: js.Object, options: ReadPreferenceOptions) = this()
  
  def isValid(mode: String): Boolean = js.native
  
  var mode: ReadPreferenceMode = js.native
  
  var tags: js.Any = js.native
}
/* static members */
object ReadPreference {
  
  @JSImport("mongodb", "ReadPreference")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "ReadPreference.NEAREST")
  @js.native
  def NEAREST: nearest = js.native
  @scala.inline
  def NEAREST_=(x: nearest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEAREST")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.PRIMARY")
  @js.native
  def PRIMARY: primary = js.native
  @scala.inline
  def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.PRIMARY_PREFERRED")
  @js.native
  def PRIMARY_PREFERRED: primaryPreferred = js.native
  @scala.inline
  def PRIMARY_PREFERRED_=(x: primaryPreferred): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.SECONDARY")
  @js.native
  def SECONDARY: secondary = js.native
  @scala.inline
  def SECONDARY_=(x: secondary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.SECONDARY_PREFERRED")
  @js.native
  def SECONDARY_PREFERRED: secondaryPreferred = js.native
  @scala.inline
  def SECONDARY_PREFERRED_=(x: secondaryPreferred): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  @JSImport("mongodb", "ReadPreference.isValid")
  @js.native
  def isValid(mode: String): Boolean = js.native
}
