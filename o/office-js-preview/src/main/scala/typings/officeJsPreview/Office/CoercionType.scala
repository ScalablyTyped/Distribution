package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoercionType extends StObject
/**
  * Specifies how to coerce data returned or set by the invoked method.
  *
  * @remarks
  * 
  * Application and platform support for each `CoercionType` is specified in the following requirement set descriptions.
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#htmlcoercion | HtmlCoercion}, (when using `Office.CoercionType.Html`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/image-coercion-requirement-sets | ImageCoercion 1.1} (when using `Office.CoercionType.Image`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#matrixcoercion | MatrixCoercion} (when using `Office.CoercionType.Matrix`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#ooxmlcoercion | OoxmlCoercion} (when using `Office.CoercionType.Ooxml`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#selection | Selection}
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#tablecoercion | TableCoercion} (when using `Office.CoercionType.Table`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/office-add-in-requirement-sets#textcoercion | TextCoercion} (when using `Office.CoercionType.Text`)
  * 
  * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/image-coercion-requirement-sets#imagecoercion-12 | ImageCoercion 1.2} (when using `Office.CoercionType.XmlSvg`)
  * 
  */
@JSGlobal("Office.CoercionType")
@js.native
object CoercionType extends StObject {
  
  /**
    * Return or set data as HTML.
    *
    * **Note**: Only applies to data in add-ins for Word and Outlook add-ins for Outlook (compose mode).
    */
  @js.native
  sealed trait Html
    extends StObject
       with CoercionType
  
  /**
    * Data is returned or set as an image stream.
    * **Note**: Only applies to data in Excel, Word, and PowerPoint.
    */
  @js.native
  sealed trait Image
    extends StObject
       with CoercionType
  
  /**
    * Return or set data as tabular data with no headers. Data is returned or set as an array of arrays containing one-dimensional runs of
    * characters. For example, three rows of  string values in two columns would be: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]].
    *
    * **Note**: Only applies to data in Excel and Word.
    */
  @js.native
  sealed trait Matrix
    extends StObject
       with CoercionType
  
  /**
    * Return or set data as Office Open XML.
    *
    * **Note**: Only applies to data in Word.
    */
  @js.native
  sealed trait Ooxml
    extends StObject
       with CoercionType
  
  /**
    * Return a JSON object that contains an array of the IDs, titles, and indexes of the selected slides. For example,
    * `{"slides":[{"id":257,"title":"Slide 2","index":2},{"id":256,"title":"Slide 1","index":1}]}` for a selection of two slides.
    *
    * **Note**: Only applies to data in PowerPoint when calling the {@link Office.Document | Document}.getSelectedData method to get the current
    * slide or selected range of slides.
    */
  @js.native
  sealed trait SlideRange
    extends StObject
       with CoercionType
  
  /**
    * Return or set data as tabular data with optional headers. Data is returned or set as an array of arrays with optional headers.
    *
    * **Note**: Only applies to data in Excel and Word.
    */
  @js.native
  sealed trait Table
    extends StObject
       with CoercionType
  
  /**
    * Return or set data as text (string). Data is returned or set as a one-dimensional run of characters.
    */
  @js.native
  sealed trait Text
    extends StObject
       with CoercionType
  
  /**
    * Data is returned or set as XML data containing an SVG image.
    * **Note**: Only applies to data in Excel, Word, and PowerPoint.
    */
  @js.native
  sealed trait XmlSvg
    extends StObject
       with CoercionType
}
