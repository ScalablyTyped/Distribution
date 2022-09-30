package typings.mobx

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iscomputedMod {
  
  @JSImport("mobx/dist/api/iscomputed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _isComputed(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def _isComputed(value: Any, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isComputed")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isComputed(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputed")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComputedProp(value: Any, propName: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isComputedProp")(value.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
