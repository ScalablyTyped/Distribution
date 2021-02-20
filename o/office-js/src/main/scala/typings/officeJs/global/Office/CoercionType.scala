package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.CoercionType with Double] = js.native
  
  /* 3 */ val Html: typings.officeJs.Office.CoercionType.Html with Double = js.native
  
  /* 6 */ val Image: typings.officeJs.Office.CoercionType.Image with Double = js.native
  
  /* 1 */ val Matrix: typings.officeJs.Office.CoercionType.Matrix with Double = js.native
  
  /* 4 */ val Ooxml: typings.officeJs.Office.CoercionType.Ooxml with Double = js.native
  
  /* 5 */ val SlideRange: typings.officeJs.Office.CoercionType.SlideRange with Double = js.native
  
  /* 2 */ val Table: typings.officeJs.Office.CoercionType.Table with Double = js.native
  
  /* 0 */ val Text: typings.officeJs.Office.CoercionType.Text with Double = js.native
  
  /* 7 */ val XmlSvg: typings.officeJs.Office.CoercionType.XmlSvg with Double = js.native
}
