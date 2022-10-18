package typings.next

import typings.next.anon.MountedInstances
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientHeadManagerMod {
  
  @JSImport("next/dist/client/head-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): MountedInstances = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MountedInstances]
  
  @JSImport("next/dist/client/head-manager", "DOMAttributeNames")
  @js.native
  val DOMAttributeNames: Record[String, String] = js.native
  
  inline def isEqualNode(oldTag: Element, newTag: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualNode")(oldTag.asInstanceOf[js.Any], newTag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
