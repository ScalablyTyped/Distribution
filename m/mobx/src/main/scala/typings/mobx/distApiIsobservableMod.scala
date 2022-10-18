package typings.mobx

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiIsobservableMod {
  
  @JSImport("mobx/dist/api/isobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isObservable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableProp(value: Any, propName: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservableProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
