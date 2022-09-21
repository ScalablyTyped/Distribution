package typings.postcss

import typings.postcss.containerMod.ContainerProps
import typings.postcss.mod.ProcessOptions
import typings.postcss.nodeMod.AnyNode
import typings.postcss.postcssStrings.document
import typings.postcss.rootMod.RootProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("postcss/lib/document", JSImport.Default)
  @js.native
  open class default ()
    extends Document
       with AnyNode {
    def this(defaults: DocumentProps) = this()
  }
  
  type ChildNode = typings.postcss.rootMod.default
  
  type ChildProps = RootProps
  
  @js.native
  trait Document
    extends typings.postcss.containerMod.default[typings.postcss.rootMod.default] {
    
    @JSName("parent")
    var parent_Document: Unit = js.native
    
    /**
      * Returns a `Result` instance representing the document’s CSS roots.
      *
      * ```js
      * const root1 = postcss.parse(css1, { from: 'a.css' })
      * const root2 = postcss.parse(css2, { from: 'b.css' })
      * const document = postcss.document()
      * document.append(root1)
      * document.append(root2)
      * const result = document.toResult({ to: 'all.css', map: true })
      * ```
      *
      * @param opts Options.
      * @return Result with current document’s CSS.
      */
    def toResult(): typings.postcss.resultMod.default = js.native
    def toResult(options: ProcessOptions): typings.postcss.resultMod.default = js.native
    
    @JSName("type")
    var type_Document: document = js.native
  }
  
  trait DocumentProps
    extends StObject
       with ContainerProps {
    
    @JSName("nodes")
    var nodes_DocumentProps: js.UndefOr[js.Array[typings.postcss.rootMod.default]] = js.undefined
    
    /**
      * Information to generate byte-to-byte equal node string as it was
      * in the origin input.
      *
      * Every parser saves its own properties.
      */
    var raws: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object DocumentProps {
    
    inline def apply(): DocumentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentProps]
    }
    
    extension [Self <: DocumentProps](x: Self) {
      
      inline def setNodes(value: js.Array[typings.postcss.rootMod.default]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: typings.postcss.rootMod.default*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setRaws(value: Record[String, Any]): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    }
  }
}
