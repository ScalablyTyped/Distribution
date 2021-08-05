package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isobservableMod {
  
  @JSImport("mobx/lib/api/isobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isObservable(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObservableProp(value: js.Any, propName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObservableProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
