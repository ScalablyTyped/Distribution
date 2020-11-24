package typings.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineType extends js.Object
/**
  *
  * The supported styles for underline format.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.UnderlineType")
@js.native
object UnderlineType extends js.Object {
  
  /**
    * A single dash underline.
    *
    */
  @js.native
  sealed trait dashLine extends UnderlineType
  
  @js.native
  sealed trait dashLineHeavy extends UnderlineType
  
  @js.native
  sealed trait dashLineLong extends UnderlineType
  
  @js.native
  sealed trait dashLineLongHeavy extends UnderlineType
  
  /**
    * An alternating dot-dash underline.
    *
    */
  @js.native
  sealed trait dotDashLine extends UnderlineType
  
  @js.native
  sealed trait dotDashLineHeavy extends UnderlineType
  
  /**
    * @deprecated DotLine is no longer supported.
    */
  @js.native
  sealed trait dotLine extends UnderlineType
  
  /**
    * A dotted underline.
    *
    */
  @js.native
  sealed trait dotted extends UnderlineType
  
  @js.native
  sealed trait dottedHeavy extends UnderlineType
  
  /**
    * A double underline.
    *
    */
  @js.native
  sealed trait double extends UnderlineType
  
  /**
    * @deprecated Hidden is no longer supported.
    */
  @js.native
  sealed trait hidden extends UnderlineType
  
  @js.native
  sealed trait mixed extends UnderlineType
  
  /**
    * No underline.
    *
    */
  @js.native
  sealed trait none extends UnderlineType
  
  /**
    * A single underline. This is the default value.
    *
    */
  @js.native
  sealed trait single extends UnderlineType
  
  /**
    * A single thick underline.
    *
    */
  @js.native
  sealed trait thick extends UnderlineType
  
  /**
    * An alternating dot-dot-dash underline.
    *
    */
  @js.native
  sealed trait twoDotDashLine extends UnderlineType
  
  @js.native
  sealed trait twoDotDashLineHeavy extends UnderlineType
  
  /**
    * A single wavy underline.
    *
    */
  @js.native
  sealed trait wave extends UnderlineType
  
  @js.native
  sealed trait waveDouble extends UnderlineType
  
  @js.native
  sealed trait waveHeavy extends UnderlineType
  
  /**
    * Only underline individual words.
    *
    */
  @js.native
  sealed trait word extends UnderlineType
}
