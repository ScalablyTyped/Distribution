package typings.officeDashJs.WordNs

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
  
  /* "DashLine" */ val dashLine: typings.officeDashJs.WordNs.UnderlineType.dashLine with String = js.native
  /* "DashLineHeavy" */ val dashLineHeavy: typings.officeDashJs.WordNs.UnderlineType.dashLineHeavy with String = js.native
  /* "DashLineLong" */ val dashLineLong: typings.officeDashJs.WordNs.UnderlineType.dashLineLong with String = js.native
  /* "DashLineLongHeavy" */ val dashLineLongHeavy: typings.officeDashJs.WordNs.UnderlineType.dashLineLongHeavy with String = js.native
  /* "DotDashLine" */ val dotDashLine: typings.officeDashJs.WordNs.UnderlineType.dotDashLine with String = js.native
  /* "DotDashLineHeavy" */ val dotDashLineHeavy: typings.officeDashJs.WordNs.UnderlineType.dotDashLineHeavy with String = js.native
  /* "DotLine" */ val dotLine: typings.officeDashJs.WordNs.UnderlineType.dotLine with String = js.native
  /* "Dotted" */ val dotted: typings.officeDashJs.WordNs.UnderlineType.dotted with String = js.native
  /* "DottedHeavy" */ val dottedHeavy: typings.officeDashJs.WordNs.UnderlineType.dottedHeavy with String = js.native
  /* "Double" */ val double: typings.officeDashJs.WordNs.UnderlineType.double with String = js.native
  /* "Hidden" */ val hidden: typings.officeDashJs.WordNs.UnderlineType.hidden with String = js.native
  /* "Mixed" */ val mixed: typings.officeDashJs.WordNs.UnderlineType.mixed with String = js.native
  /* "None" */ val none: typings.officeDashJs.WordNs.UnderlineType.none with String = js.native
  /* "Single" */ val single: typings.officeDashJs.WordNs.UnderlineType.single with String = js.native
  /* "Thick" */ val thick: typings.officeDashJs.WordNs.UnderlineType.thick with String = js.native
  /* "TwoDotDashLine" */ val twoDotDashLine: typings.officeDashJs.WordNs.UnderlineType.twoDotDashLine with String = js.native
  /* "TwoDotDashLineHeavy" */ val twoDotDashLineHeavy: typings.officeDashJs.WordNs.UnderlineType.twoDotDashLineHeavy with String = js.native
  /* "Wave" */ val wave: typings.officeDashJs.WordNs.UnderlineType.wave with String = js.native
  /* "WaveDouble" */ val waveDouble: typings.officeDashJs.WordNs.UnderlineType.waveDouble with String = js.native
  /* "WaveHeavy" */ val waveHeavy: typings.officeDashJs.WordNs.UnderlineType.waveHeavy with String = js.native
  /* "Word" */ val word: typings.officeDashJs.WordNs.UnderlineType.word with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UnderlineType with String] = js.native
}

