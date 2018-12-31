package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait dashLine
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait dashLineHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait dashLineLong
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait dashLineLongHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * An alternating dot-dash underline.
    *
    */
  @js.native
  sealed trait dotDashLine
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait dotDashLineHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * @deprecated DotLine is no longer supported.
    */
  @js.native
  sealed trait dotLine
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * A dotted underline.
    *
    */
  @js.native
  sealed trait dotted
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait dottedHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * A double underline.
    *
    */
  @js.native
  sealed trait double
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * @deprecated Hidden is no longer supported.
    */
  @js.native
  sealed trait hidden
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait mixed
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * No underline.
    *
    */
  @js.native
  sealed trait none
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * A single underline. This is the default value.
    *
    */
  @js.native
  sealed trait single
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * A single thick underline.
    *
    */
  @js.native
  sealed trait thick
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * An alternating dot-dot-dash underline.
    *
    */
  @js.native
  sealed trait twoDotDashLine
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait twoDotDashLineHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * A single wavy underline.
    *
    */
  @js.native
  sealed trait wave
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait waveDouble
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  @js.native
  sealed trait waveHeavy
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /**
    *
    * Only underline individual words.
    *
    */
  @js.native
  sealed trait word
    extends officeDashJsDashPreviewLib.WordNs.UnderlineType
  
  /* "DashLine" */ val dashLine: dashLine with java.lang.String = js.native
  /* "DashLineHeavy" */ val dashLineHeavy: dashLineHeavy with java.lang.String = js.native
  /* "DashLineLong" */ val dashLineLong: dashLineLong with java.lang.String = js.native
  /* "DashLineLongHeavy" */ val dashLineLongHeavy: dashLineLongHeavy with java.lang.String = js.native
  /* "DotDashLine" */ val dotDashLine: dotDashLine with java.lang.String = js.native
  /* "DotDashLineHeavy" */ val dotDashLineHeavy: dotDashLineHeavy with java.lang.String = js.native
  /* "DotLine" */ val dotLine: dotLine with java.lang.String = js.native
  /* "Dotted" */ val dotted: dotted with java.lang.String = js.native
  /* "DottedHeavy" */ val dottedHeavy: dottedHeavy with java.lang.String = js.native
  /* "Double" */ val double: double with java.lang.String = js.native
  /* "Hidden" */ val hidden: hidden with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "Single" */ val single: single with java.lang.String = js.native
  /* "Thick" */ val thick: thick with java.lang.String = js.native
  /* "TwoDotDashLine" */ val twoDotDashLine: twoDotDashLine with java.lang.String = js.native
  /* "TwoDotDashLineHeavy" */ val twoDotDashLineHeavy: twoDotDashLineHeavy with java.lang.String = js.native
  /* "Wave" */ val wave: wave with java.lang.String = js.native
  /* "WaveDouble" */ val waveDouble: waveDouble with java.lang.String = js.native
  /* "WaveHeavy" */ val waveHeavy: waveHeavy with java.lang.String = js.native
  /* "Word" */ val word: word with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.UnderlineType with java.lang.String] = js.native
}

