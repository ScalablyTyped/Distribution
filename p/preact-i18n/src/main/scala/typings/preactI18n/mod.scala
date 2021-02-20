package typings.preactI18n

import org.scalablytyped.runtime.Instantiable2
import typings.preact.mod.Component
import typings.preact.mod.ComponentChild
import typings.preact.mod.VNode
import typings.preactI18n.anon.Children
import typings.preactI18n.anon.Definition
import typings.preactI18n.anon.Fields
import typings.preactI18n.anon.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("preact-i18n", JSImport.Default)
  @js.native
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ _
    ]
  ): VNode[js.Object] = js.native
  @JSImport("preact-i18n", JSImport.Default)
  @js.native
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ _
    ],
    options: Scope
  ): VNode[js.Object] = js.native
  
  @JSImport("preact-i18n", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends Component[
          Definition, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ] {
    def this(props: Definition) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: Definition, context: js.Any) = this()
  }
  
  @JSImport("preact-i18n", "Localizer")
  @js.native
  class Localizer ()
    extends Component[
          Children, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ] {
    def this(props: Children) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: Children, context: js.Any) = this()
  }
  
  @JSImport("preact-i18n", "MarkupText")
  @js.native
  class MarkupText () extends TextComponent {
    def this(props: Fields) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: Fields, context: js.Any) = this()
  }
  
  @JSImport("preact-i18n", "Text")
  @js.native
  class Text () extends TextComponent {
    def this(props: Fields) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: Fields, context: js.Any) = this()
  }
  
  @JSImport("preact-i18n", "TextComponent")
  @js.native
  class TextComponent ()
    extends Component[
          Fields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ js.Any
        ] {
    def this(props: Fields) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: Fields, context: js.Any) = this()
  }
  
  @JSImport("preact-i18n", "withText")
  @js.native
  def withText[Props, Context](mapping: js.Object): js.Function1[
    /* Child */ ComponentChild, 
    Instantiable2[/* props */ js.UndefOr[Props], /* context */ js.UndefOr[Context], js.Any]
  ] = js.native
}
