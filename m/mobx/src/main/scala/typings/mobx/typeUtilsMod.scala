package typings.mobx

import typings.mobx.coreObservableMod.IDepTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeUtilsMod {
  
  @JSImport("mobx/lib/types/type-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdministration(thing: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getAdministration(thing: js.Any, property: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAdministration")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getAtom(thing: js.Any): IDepTreeNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any]).asInstanceOf[IDepTreeNode]
  inline def getAtom(thing: js.Any, property: String): IDepTreeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getAtom")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDepTreeNode]
  
  inline def getDebugName(thing: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDebugName(thing: js.Any, property: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDebugName")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[String]
}
