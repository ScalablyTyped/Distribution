package typings.preactDashI18n

import org.scalablytyped.runtime.Instantiable2
import typings.preactDashI18n.preactDashI18nMod.IntlProvider
import typings.preactDashI18n.preactDashI18nMod.Localizer
import typings.preactDashI18n.preactDashI18nMod.TextComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact-i18n", JSImport.Namespace)
@js.native
object preactDashI18nMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component<{  scope ? :any,   mark ? :boolean,   definition ? :{}}> * / any */ @js.native
  class IntlProvider () extends js.Object {
    def render(): IntlProvider = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component<{  children  :ComponentChildren}> * / any */ @js.native
  class Localizer () extends js.Object {
    def render(): Localizer = js.native
  }
  
  @js.native
  class MarkupText () extends TextComponent
  
  @js.native
  class Text () extends TextComponent
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component<{  id  :string,   fields ? :{},   plural ? :number}> * / any */ @js.native
  class TextComponent () extends js.Object {
    def render(): TextComponent = js.native
  }
  
  def default(
    Child: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component */ js.Any
  ): js.Any = js.native
  def default(
    Child: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Component */ js.Any,
    options: Anon_Definition
  ): js.Any = js.native
  def withText[Props, Context](mapping: js.Object): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentChild */ /* Child */ js.Any, 
    Instantiable2[js.UndefOr[/* props */ Props], js.UndefOr[/* context */ Context], js.Any]
  ] = js.native
}

