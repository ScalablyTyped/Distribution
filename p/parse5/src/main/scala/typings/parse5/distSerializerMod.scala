package typings.parse5

import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapter
import typings.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSerializerMod {
  
  @JSImport("parse5/dist/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait SerializerOptions[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    /**
      * The [scripting flag](https://html.spec.whatwg.org/multipage/parsing.html#scripting-flag). If set
      * to `true`, `noscript` element content will not be escaped.
      *
      *  @default `true`
      */
    var scriptingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies input tree format.
      *
      * @default `treeAdapters.default`
      */
    var treeAdapter: js.UndefOr[TreeAdapter[T]] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): SerializerOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions[T]]
    }
    
    extension [Self <: SerializerOptions[?], T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & SerializerOptions[T]) {
      
      inline def setScriptingEnabled(value: Boolean): Self = StObject.set(x, "scriptingEnabled", value.asInstanceOf[js.Any])
      
      inline def setScriptingEnabledUndefined: Self = StObject.set(x, "scriptingEnabled", js.undefined)
      
      inline def setTreeAdapter(value: TreeAdapter[T]): Self = StObject.set(x, "treeAdapter", value.asInstanceOf[js.Any])
      
      inline def setTreeAdapterUndefined: Self = StObject.set(x, "treeAdapter", js.undefined)
    }
  }
}
