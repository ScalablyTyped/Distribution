package typings.opentypeJs.mod

import typings.opentypeJs.opentypeJsStrings.C
import typings.opentypeJs.opentypeJsStrings.L
import typings.opentypeJs.opentypeJsStrings.M
import typings.opentypeJs.opentypeJsStrings.Q
import typings.opentypeJs.opentypeJsStrings.Z
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.opentypeJs.anon.Type
  - typings.opentypeJs.anon.X
  - typings.opentypeJs.anon.X1
  - typings.opentypeJs.anon.Y
  - typings.opentypeJs.anon.`0`
*/
trait PathCommand extends js.Object
object PathCommand {
  
  @scala.inline
  def `0`(`type`: Z): PathCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def Type(`type`: M, x: Double, y: Double): PathCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def X(`type`: L, x: Double, y: Double): PathCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def X1(`type`: C, x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): PathCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
  
  @scala.inline
  def Y(`type`: Q, x: Double, x1: Double, y: Double, y1: Double): PathCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommand]
  }
}
