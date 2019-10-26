package typings.preactDashI18n

import org.scalablytyped.runtime.Instantiable2
import typings.preact.srcMod.Component
import typings.preact.srcMod.ComponentChild
import typings.preact.srcMod.VNode
import typings.preactDashI18n.preactDashI18nMod.TextComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact-i18n", JSImport.Namespace)
@js.native
object preactDashI18nMod extends js.Object {
  @js.native
  class IntlProvider ()
    extends Component[
          Anon_Definition, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ js.Any
        ]
  
  @js.native
  class Localizer ()
    extends Component[
          Anon_Children, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ js.Any
        ]
  
  @js.native
  class MarkupText () extends TextComponent
  
  @js.native
  class Text () extends TextComponent
  
  @js.native
  class TextComponent ()
    extends Component[
          Anon_Fields, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ js.Any
        ]
  
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
    ]
  ): VNode[js.Object] = js.native
  def default(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
    ],
    options: Anon_DefinitionScope
  ): VNode[js.Object] = js.native
  def withText[Props, Context](mapping: js.Object): js.Function1[
    /* Child */ ComponentChild, 
    Instantiable2[js.UndefOr[/* props */ Props], js.UndefOr[/* context */ Context], js.Any]
  ] = js.native
}

