package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineType extends StObject
/**
  *
  * The supported styles for underline format.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.UnderlineType")
@js.native
object UnderlineType extends StObject {
  
  /**
    * A single dash underline.
    *
    */
  @js.native
  sealed trait dashLine
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait dashLineHeavy
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait dashLineLong
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait dashLineLongHeavy
    extends StObject
       with UnderlineType
  
  /**
    * An alternating dot-dash underline.
    *
    */
  @js.native
  sealed trait dotDashLine
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait dotDashLineHeavy
    extends StObject
       with UnderlineType
  
  /**
    * @deprecated DotLine is no longer supported.
    */
  @js.native
  sealed trait dotLine
    extends StObject
       with UnderlineType
  
  /**
    * A dotted underline.
    *
    */
  @js.native
  sealed trait dotted
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait dottedHeavy
    extends StObject
       with UnderlineType
  
  /**
    * A double underline.
    *
    */
  @js.native
  sealed trait double
    extends StObject
       with UnderlineType
  
  /**
    * @deprecated Hidden is no longer supported.
    */
  @js.native
  sealed trait hidden
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait mixed
    extends StObject
       with UnderlineType
  
  /**
    * No underline.
    *
    */
  @js.native
  sealed trait none
    extends StObject
       with UnderlineType
  
  /**
    * A single underline. This is the default value.
    *
    */
  @js.native
  sealed trait single
    extends StObject
       with UnderlineType
  
  /**
    * A single thick underline.
    *
    */
  @js.native
  sealed trait thick
    extends StObject
       with UnderlineType
  
  /**
    * An alternating dot-dot-dash underline.
    *
    */
  @js.native
  sealed trait twoDotDashLine
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait twoDotDashLineHeavy
    extends StObject
       with UnderlineType
  
  /**
    * A single wavy underline.
    *
    */
  @js.native
  sealed trait wave
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait waveDouble
    extends StObject
       with UnderlineType
  
  @js.native
  sealed trait waveHeavy
    extends StObject
       with UnderlineType
  
  /**
    * Only underline individual words.
    *
    */
  @js.native
  sealed trait word
    extends StObject
       with UnderlineType
}
