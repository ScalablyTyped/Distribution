package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distCollectionSrcUseCollectionMod.NodeType
import typings.react.mod.ComponentClass
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: ElementType[Any] | js.Array[ReactElement]
  
  var elementType: String | FunctionComponent[Any] | (ComponentClass[Any, Any])
  
  var index: Double
  
  var key: String
  
  var props: Record[String, Any]
  
  var ref: typings.react.mod.Ref[Any]
  
  var `type`: NodeType
}
object Content {
  
  inline def apply(
    content: ElementType[Any] | js.Array[ReactElement],
    elementType: String | FunctionComponent[Any] | (ComponentClass[Any, Any]),
    index: Double,
    key: String,
    props: Record[String, Any],
    `type`: NodeType
  ): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], ref = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ElementType[Any] | js.Array[ReactElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: ReactElement*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setElementType(value: String | FunctionComponent[Any] | (ComponentClass[Any, Any])): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
