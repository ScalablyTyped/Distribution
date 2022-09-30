package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnderlineType extends StObject
/**
  * The supported styles for underline format.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.UnderlineType")
@js.native
object UnderlineType extends StObject {
  
  /**
    * A single dash underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dashLine
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dashLineHeavy
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dashLineLong
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dashLineLongHeavy
    extends StObject
       with UnderlineType
  
  /**
    * An alternating dot-dash underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dotDashLine
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dotDashLineHeavy
    extends StObject
       with UnderlineType
  
  /**
    * @deprecated DotLine is no longer supported.
    * Warning: dotLine has been deprecated.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dotLine
    extends StObject
       with UnderlineType
  
  /**
    * A dotted underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dotted
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait dottedHeavy
    extends StObject
       with UnderlineType
  
  /**
    * A double underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait double
    extends StObject
       with UnderlineType
  
  /**
    * @deprecated Hidden is no longer supported.
    * Warning: hidden has been deprecated.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait hidden
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait mixed
    extends StObject
       with UnderlineType
  
  /**
    * No underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait none
    extends StObject
       with UnderlineType
  
  /**
    * A single underline. This is the default value.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait single
    extends StObject
       with UnderlineType
  
  /**
    * A single thick underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait thick
    extends StObject
       with UnderlineType
  
  /**
    * An alternating dot-dot-dash underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait twoDotDashLine
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait twoDotDashLineHeavy
    extends StObject
       with UnderlineType
  
  /**
    * A single wavy underline.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait wave
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait waveDouble
    extends StObject
       with UnderlineType
  
  /**
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait waveHeavy
    extends StObject
       with UnderlineType
  
  /**
    * Only underline individual words.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait word
    extends StObject
       with UnderlineType
}
