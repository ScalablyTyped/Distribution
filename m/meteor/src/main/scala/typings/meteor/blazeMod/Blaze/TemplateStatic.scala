package typings.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateStatic
  extends Instantiable0[Template]
     with Instantiable1[/* viewName */ String, Template]
     with Instantiable2[js.UndefOr[/* viewName */ String], /* renderFunction */ js.Function, Template] {
  
  def currentData(): js.Any = js.native
  
  def instance(): TemplateInstance = js.native
  
  def parentData(numLevels: Double): js.Any = js.native
  
  def registerHelper(name: String, func: js.Function): Unit = js.native
}
