package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.nodeRedEditorClientInts.`0`
import typings.nodeRedEditorClient.nodeRedEditorClientInts.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @node-red/editor-client.@node-red/editor-client.NodeInstance<@node-red/editor-client.@node-red/editor-client.NodeProperties> */
@js.native
trait NodeInstanceNodePropertie extends StObject {
  
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String = js.native
  
  val h: Double = js.native
  
  val id: String = js.native
  
  var inputs: js.UndefOr[`0` | `1`] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  val outputs: Double = js.native
  
  val `type`: String = js.native
  
  val w: Double = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
  
  val z: String = js.native
}
