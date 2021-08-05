package typings.nodeRedEditorClient.anon

import typings.nodeRedUtil.mod.I18nTFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @node-red/editor-client.@node-red/editor-client.NodeInstance<@node-red/editor-client.@node-red/editor-client.NodeProperties> */
trait NodeInstanceNodePropertie extends StObject {
  
  @JSName("_")
  def _underscore(id: String): String
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String
  @JSName("_")
  var _underscore_Original: I18nTFunction
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var a: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var b: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var c: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var changed: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var d: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var dirty: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var e: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var f: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var g: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var h: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var i: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var icon: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var id: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var info: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var inputLabels: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var inputs: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var j: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var k: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var l: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var m: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var n: js.UndefOr[scala.Nothing] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var o: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var outputLabels: js.UndefOr[scala.Nothing] = js.undefined
  
  /** If a node wants to allow the number of outputs it provides to be configurable then outputs may be included. */
  var outputs: js.UndefOr[Double] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var p: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var ports: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var q: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var r: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var s: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var selected: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var t: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var u: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var v: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var valid: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var validationErrors: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var w: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var wires: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var x: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var y: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var z: js.UndefOr[scala.Nothing] = js.undefined
}
object NodeInstanceNodePropertie {
  
  inline def apply(
    _underscore: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String
  ): NodeInstanceNodePropertie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(js.Any.fromFunction2(_underscore))
    __obj.asInstanceOf[NodeInstanceNodePropertie]
  }
  
  extension [Self <: NodeInstanceNodePropertie](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputs(value: Double): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def set_underscore(value: (/* id */ String, /* tplStrs */ js.UndefOr[Record[String, String | Double]]) => String): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
  }
}
