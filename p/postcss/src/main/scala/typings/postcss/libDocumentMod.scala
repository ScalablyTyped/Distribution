package typings.postcss

import typings.postcss.libContainerMod.ContainerProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.mod.ProcessOptions
import typings.postcss.postcssStrings.document
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDocumentMod {
  
  @JSImport("postcss/lib/document", JSImport.Namespace)
  @js.native
  open class ^ () extends Document_
  
  /**
    * Represents a file and contains all its parsed nodes.
    *
    * **Experimental:** some aspects of this node could change within minor
    * or patch version releases.
    *
    * ```js
    * const document = htmlParser(
    *   '<html><style>a{color:black}</style><style>b{z-index:2}</style>'
    * )
    * document.type         //=> 'document'
    * document.nodes.length //=> 2
    * ```
    */
  @JSImport("postcss/lib/document", JSImport.Default)
  @js.native
  open class default ()
    extends Document_
       with AnyNode {
    def this(defaults: DocumentProps) = this()
  }
  
  type Document = Document_
  
  trait DocumentProps
    extends StObject
       with ContainerProps {
    
    @JSName("nodes")
    var nodes_DocumentProps: js.UndefOr[js.Array[typings.postcss.libRootMod.default]] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentProps] (val x: Self) extends AnyVal {
      
      inline def setNodes(value: js.Array[typings.postcss.libRootMod.default]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: typings.postcss.libRootMod.default*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setRaws(value: Record[String, Any]): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    }
  }
  
  /**
    * Represents a file and contains all its parsed nodes.
    *
    * **Experimental:** some aspects of this node could change within minor
    * or patch version releases.
    *
    * ```js
    * const document = htmlParser(
    *   '<html><style>a{color:black}</style><style>b{z-index:2}</style>'
    * )
    * document.type         //=> 'document'
    * document.nodes.length //=> 2
    * ```
    */
  @js.native
  trait Document_
    extends typings.postcss.libContainerMod.default[typings.postcss.libRootMod.default] {
    
    var parent: Unit = js.native
    
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
    def toResult(): typings.postcss.libResultMod.default = js.native
    def toResult(options: ProcessOptions): typings.postcss.libResultMod.default = js.native
    
    var `type`: document = js.native
  }
}
