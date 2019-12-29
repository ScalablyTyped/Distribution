package typings.officeDashJs.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UnderlineType with String] = js.native
  /* "DashLine" */ @js.native
  object dashLine extends TopLevel[dashLine with String]
  
  /* "DashLineHeavy" */ @js.native
  object dashLineHeavy extends TopLevel[dashLineHeavy with String]
  
  /* "DashLineLong" */ @js.native
  object dashLineLong extends TopLevel[dashLineLong with String]
  
  /* "DashLineLongHeavy" */ @js.native
  object dashLineLongHeavy extends TopLevel[dashLineLongHeavy with String]
  
  /* "DotDashLine" */ @js.native
  object dotDashLine extends TopLevel[dotDashLine with String]
  
  /* "DotDashLineHeavy" */ @js.native
  object dotDashLineHeavy extends TopLevel[dotDashLineHeavy with String]
  
  /* "DotLine" */ @js.native
  object dotLine extends TopLevel[dotLine with String]
  
  /* "Dotted" */ @js.native
  object dotted extends TopLevel[dotted with String]
  
  /* "DottedHeavy" */ @js.native
  object dottedHeavy extends TopLevel[dottedHeavy with String]
  
  /* "Double" */ @js.native
  object double extends TopLevel[double with String]
  
  /* "Hidden" */ @js.native
  object hidden extends TopLevel[hidden with String]
  
  /* "Mixed" */ @js.native
  object mixed extends TopLevel[mixed with String]
  
  /* "None" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "Single" */ @js.native
  object single extends TopLevel[single with String]
  
  /* "Thick" */ @js.native
  object thick extends TopLevel[thick with String]
  
  /* "TwoDotDashLine" */ @js.native
  object twoDotDashLine extends TopLevel[twoDotDashLine with String]
  
  /* "TwoDotDashLineHeavy" */ @js.native
  object twoDotDashLineHeavy extends TopLevel[twoDotDashLineHeavy with String]
  
  /* "Wave" */ @js.native
  object wave extends TopLevel[wave with String]
  
  /* "WaveDouble" */ @js.native
  object waveDouble extends TopLevel[waveDouble with String]
  
  /* "WaveHeavy" */ @js.native
  object waveHeavy extends TopLevel[waveHeavy with String]
  
  /* "Word" */ @js.native
  object word extends TopLevel[word with String]
  
}

