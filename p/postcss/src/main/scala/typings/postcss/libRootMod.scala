package typings.postcss

import typings.postcss.libContainerMod.ContainerProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.mod.ProcessOptions
import typings.postcss.postcssStrings.root
import typings.std.ChildNode
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRootMod {
  
  @JSImport("postcss/lib/root", JSImport.Namespace)
  @js.native
  open class ^ () extends Root_
  
  /**
    * Represents a CSS file and contains all its parsed nodes.
    *
    * ```js
    * const root = postcss.parse('a{color:black} b{z-index:2}')
    * root.type         //=> 'root'
    * root.nodes.length //=> 2
    * ```
    */
  @JSImport("postcss/lib/root", JSImport.Default)
  @js.native
  open class default ()
    extends Root_
       with AnyNode {
    def this(defaults: RootProps) = this()
  }
  
  type Root = Root_
  
  trait RootProps
    extends StObject
       with ContainerProps {
    
    /**
      * Information used to generate byte-to-byte equal node string
      * as it was in the origin input.
      * */
    var raws: js.UndefOr[RootRaws] = js.undefined
  }
  object RootProps {
    
    inline def apply(): RootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootProps] (val x: Self) extends AnyVal {
      
      inline def setRaws(value: RootRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait RootRaws extends StObject {
    
    /**
      * The space symbols after the last child to the end of file.
      */
    var after: js.UndefOr[String] = js.undefined
    
    /**
      * Non-CSS code after `Root`, when `Root` is inside `Document`.
      *
      * **Experimental:** some aspects of this node could change within minor
      * or patch version releases.
      */
    var codeAfter: js.UndefOr[String] = js.undefined
    
    /**
      * Non-CSS code before `Root`, when `Root` is inside `Document`.
      *
      * **Experimental:** some aspects of this node could change within minor
      * or patch version releases.
      */
    var codeBefore: js.UndefOr[String] = js.undefined
    
    /**
      * Is the last child has an (optional) semicolon.
      */
    var semicolon: js.UndefOr[Boolean] = js.undefined
  }
  object RootRaws {
    
    inline def apply(): RootRaws = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRaws]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootRaws] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setCodeAfter(value: String): Self = StObject.set(x, "codeAfter", value.asInstanceOf[js.Any])
      
      inline def setCodeAfterUndefined: Self = StObject.set(x, "codeAfter", js.undefined)
      
      inline def setCodeBefore(value: String): Self = StObject.set(x, "codeBefore", value.asInstanceOf[js.Any])
      
      inline def setCodeBeforeUndefined: Self = StObject.set(x, "codeBefore", js.undefined)
      
      inline def setSemicolon(value: Boolean): Self = StObject.set(x, "semicolon", value.asInstanceOf[js.Any])
      
      inline def setSemicolonUndefined: Self = StObject.set(x, "semicolon", js.undefined)
    }
  }
  
  /**
    * Represents a CSS file and contains all its parsed nodes.
    *
    * ```js
    * const root = postcss.parse('a{color:black} b{z-index:2}')
    * root.type         //=> 'root'
    * root.nodes.length //=> 2
    * ```
    */
  @js.native
  trait Root_
    extends typings.postcss.libContainerMod.default[ChildNode] {
    
    def assign(overrides: js.Object): this.type = js.native
    def assign(overrides: RootProps): this.type = js.native
    
    var parent: js.UndefOr[Document] = js.native
    
    var raws: RootRaws = js.native
    
    /**
      * Returns a `Result` instance representing the root’s CSS.
      *
      * ```js
      * const root1 = postcss.parse(css1, { from: 'a.css' })
      * const root2 = postcss.parse(css2, { from: 'b.css' })
      * root1.append(root2)
      * const result = root1.toResult({ to: 'all.css', map: true })
      * ```
      *
      * @param opts Options.
      * @return Result with current root’s CSS.
      */
    def toResult(): typings.postcss.libResultMod.default = js.native
    def toResult(options: ProcessOptions): typings.postcss.libResultMod.default = js.native
    
    var `type`: root = js.native
  }
}
