package typings
package mimeDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mime-types", JSImport.Namespace)
@js.native
object mimeDashTypesMod extends js.Object {
  def charset(typeString: java.lang.String): java.lang.String | mimeDashTypesLib.mimeDashTypesLibNumbers.`false` = js.native
  def contentType(filenameOrExt: java.lang.String): java.lang.String | mimeDashTypesLib.mimeDashTypesLibNumbers.`false` = js.native
  def extension(typeString: java.lang.String): java.lang.String | mimeDashTypesLib.mimeDashTypesLibNumbers.`false` = js.native
  def lookup(filenameOrExt: java.lang.String): java.lang.String | mimeDashTypesLib.mimeDashTypesLibNumbers.`false` = js.native
  @js.native
  object extensions
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  @js.native
  object types
    extends /* key */ ScalablyTyped.runtime.StringDictionary[java.lang.String]
  
}

