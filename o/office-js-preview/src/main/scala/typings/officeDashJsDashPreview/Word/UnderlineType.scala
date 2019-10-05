package typings.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnderlineType extends js.Object

/**
  *
  * Underline types
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.UnderlineType")
@js.native
object UnderlineType extends js.Object {
  /**
    *
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
    *
    * An alternating dot-dash underline.
    *
    */
  @js.native
  sealed trait dotDashLine extends UnderlineType
  
  @js.native
  sealed trait dotDashLineHeavy extends UnderlineType
  
  /**
    *
    * @deprecated DotLine is no longer supported.
    */
  @js.native
  sealed trait dotLine extends UnderlineType
  
  /**
    *
    * A dotted underline.
    *
    */
  @js.native
  sealed trait dotted extends UnderlineType
  
  @js.native
  sealed trait dottedHeavy extends UnderlineType
  
  /**
    *
    * A double underline.
    *
    */
  @js.native
  sealed trait double extends UnderlineType
  
  /**
    *
    * @deprecated Hidden is no longer supported.
    */
  @js.native
  sealed trait hidden extends UnderlineType
  
  @js.native
  sealed trait mixed extends UnderlineType
  
  /**
    *
    * No underline.
    *
    */
  @js.native
  sealed trait none extends UnderlineType
  
  /**
    *
    * A single underline. This is the default value.
    *
    */
  @js.native
  sealed trait single extends UnderlineType
  
  /**
    *
    * A single thick underline.
    *
    */
  @js.native
  sealed trait thick extends UnderlineType
  
  /**
    *
    * An alternating dot-dot-dash underline.
    *
    */
  @js.native
  sealed trait twoDotDashLine extends UnderlineType
  
  @js.native
  sealed trait twoDotDashLineHeavy extends UnderlineType
  
  /**
    *
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
    *
    * Only underline individual words.
    *
    */
  @js.native
  sealed trait word extends UnderlineType
  
  /* "DashLine" */ val dashLine: typings.officeDashJsDashPreview.Word.UnderlineType.dashLine with String = js.native
  /* "DashLineHeavy" */ val dashLineHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.dashLineHeavy with String = js.native
  /* "DashLineLong" */ val dashLineLong: typings.officeDashJsDashPreview.Word.UnderlineType.dashLineLong with String = js.native
  /* "DashLineLongHeavy" */ val dashLineLongHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.dashLineLongHeavy with String = js.native
  /* "DotDashLine" */ val dotDashLine: typings.officeDashJsDashPreview.Word.UnderlineType.dotDashLine with String = js.native
  /* "DotDashLineHeavy" */ val dotDashLineHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.dotDashLineHeavy with String = js.native
  /* "DotLine" */ val dotLine: typings.officeDashJsDashPreview.Word.UnderlineType.dotLine with String = js.native
  /* "Dotted" */ val dotted: typings.officeDashJsDashPreview.Word.UnderlineType.dotted with String = js.native
  /* "DottedHeavy" */ val dottedHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.dottedHeavy with String = js.native
  /* "Double" */ val double: typings.officeDashJsDashPreview.Word.UnderlineType.double with String = js.native
  /* "Hidden" */ val hidden: typings.officeDashJsDashPreview.Word.UnderlineType.hidden with String = js.native
  /* "Mixed" */ val mixed: typings.officeDashJsDashPreview.Word.UnderlineType.mixed with String = js.native
  /* "None" */ val none: typings.officeDashJsDashPreview.Word.UnderlineType.none with String = js.native
  /* "Single" */ val single: typings.officeDashJsDashPreview.Word.UnderlineType.single with String = js.native
  /* "Thick" */ val thick: typings.officeDashJsDashPreview.Word.UnderlineType.thick with String = js.native
  /* "TwoDotDashLine" */ val twoDotDashLine: typings.officeDashJsDashPreview.Word.UnderlineType.twoDotDashLine with String = js.native
  /* "TwoDotDashLineHeavy" */ val twoDotDashLineHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.twoDotDashLineHeavy with String = js.native
  /* "Wave" */ val wave: typings.officeDashJsDashPreview.Word.UnderlineType.wave with String = js.native
  /* "WaveDouble" */ val waveDouble: typings.officeDashJsDashPreview.Word.UnderlineType.waveDouble with String = js.native
  /* "WaveHeavy" */ val waveHeavy: typings.officeDashJsDashPreview.Word.UnderlineType.waveHeavy with String = js.native
  /* "Word" */ val word: typings.officeDashJsDashPreview.Word.UnderlineType.word with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UnderlineType with String] = js.native
}

