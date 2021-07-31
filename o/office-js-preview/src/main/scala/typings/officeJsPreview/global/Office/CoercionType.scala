package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to coerce data returned or set by the invoked method.
  *
  * @remarks
  *
  * PowerPoint supports only `Office.CoercionType.Text`, `Office.CoercionType.Image`, `Office.CoercionType.SlideRange`, and `Office.CoercionType.XmlSvg`.
  *
  * Project supports only `Office.CoercionType.Text`.
  */
@JSGlobal("Office.CoercionType")
@js.native
object CoercionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.CoercionType & Double] = js.native
  
  /* 3 */ val Html: typings.officeJsPreview.Office.CoercionType.Html & Double = js.native
  
  /* 6 */ val Image: typings.officeJsPreview.Office.CoercionType.Image & Double = js.native
  
  /* 1 */ val Matrix: typings.officeJsPreview.Office.CoercionType.Matrix & Double = js.native
  
  /* 4 */ val Ooxml: typings.officeJsPreview.Office.CoercionType.Ooxml & Double = js.native
  
  /* 5 */ val SlideRange: typings.officeJsPreview.Office.CoercionType.SlideRange & Double = js.native
  
  /* 2 */ val Table: typings.officeJsPreview.Office.CoercionType.Table & Double = js.native
  
  /* 0 */ val Text: typings.officeJsPreview.Office.CoercionType.Text & Double = js.native
  
  /* 7 */ val XmlSvg: typings.officeJsPreview.Office.CoercionType.XmlSvg & Double = js.native
}
