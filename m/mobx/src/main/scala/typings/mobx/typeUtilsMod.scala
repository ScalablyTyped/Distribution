package typings.mobx

import typings.mobx.coreObservableMod.IDepTreeNode
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeUtilsMod {
  
  @JSImport("mobx/dist/types/type-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdministration(thing: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getAdministration(thing: Any, property: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAtom(thing: Any): IDepTreeNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any]).asInstanceOf[IDepTreeNode]
  inline def getAtom(thing: Any, property: PropertyKey): IDepTreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDepTreeNode]
  
  inline def getDebugName(thing: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDebugName(thing: Any, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
}
