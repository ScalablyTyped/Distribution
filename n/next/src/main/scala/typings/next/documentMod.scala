package typings.next

import typings.next.anon.ReadonlyHtmlProps
import typings.next.distPagesDocumentMod.HeadProps
import typings.next.distPagesDocumentMod.OriginProps
import typings.next.distSharedLibHtmlContextMod.HtmlProps
import typings.next.distSharedLibUtilsMod.DocumentContext
import typings.next.distSharedLibUtilsMod.DocumentInitialProps
import typings.react.mod.Context
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HtmlHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLHtmlElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("next/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/document", JSImport.Default)
  @js.native
  open class default[P] ()
    extends typings.next.distPagesDocumentMod.default[P]
  /* static members */
  object default {
    
    @JSImport("next/document", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `getInitialProps` hook returns the context object with the addition of `renderPage`.
      * `renderPage` callback executes `React` rendering logic synchronously to support server-rendering wrappers
      */
    inline def getInitialProps(ctx: DocumentContext): js.Promise[DocumentInitialProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentInitialProps]]
  }
  
  @JSImport("next/document", "Head")
  @js.native
  open class Head protected ()
    extends typings.next.distPagesDocumentMod.Head {
    def this(props: HeadProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeadProps, context: Any) = this()
  }
  /* static members */
  object Head {
    
    @JSImport("next/document", "Head")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/document", "Head.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  inline def Html(props: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Html")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Main(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Main")().asInstanceOf[Element]
  
  @JSImport("next/document", "NextScript")
  @js.native
  open class NextScript protected ()
    extends typings.next.distPagesDocumentMod.NextScript {
    def this(props: OriginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OriginProps, context: Any) = this()
  }
  /* static members */
  object NextScript {
    
    @JSImport("next/document", "NextScript")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/document", "NextScript.contextType")
    @js.native
    def contextType: Context[HtmlProps] = js.native
    inline def contextType_=(x: Context[HtmlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    inline def getInlineScriptSource(context: ReadonlyHtmlProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInlineScriptSource")(context.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
