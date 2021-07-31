package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decorateMod {
  
  @JSImport("mobx/lib/api/decorate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(clazz.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typings.mobx.mobxStrings.decorate & TopLevel[js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(`object`.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[T]
}
