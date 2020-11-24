package typings.prettierLinterHelpers.mod

import typings.prettierLinterHelpers.prettierLinterHelpersStrings.delete
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.insert
import typings.prettierLinterHelpers.prettierLinterHelpersStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateDifferences_ extends js.Object {
  
  /**
    * Generate results for differences between source code and formatted version.
    *
    * @param source - The original source.
    * @param prettierSource - The Prettier formatted source.
    * @returns An array containing { operation, offset, insertText, deleteText }
    */
  def apply(source: String, prettierSource: String): js.Array[Difference] = js.native
  
  var DELETE: delete = js.native
  
  var INSERT: insert = js.native
  
  var REPLACE: replace = js.native
}
