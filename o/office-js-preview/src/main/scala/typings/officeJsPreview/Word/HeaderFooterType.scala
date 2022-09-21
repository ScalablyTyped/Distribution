package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderFooterType extends StObject
/**
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.HeaderFooterType")
@js.native
object HeaderFooterType extends StObject {
  
  /**
    * Returns all headers or footers on even-numbered pages of a section.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait evenPages
    extends StObject
       with HeaderFooterType
  
  /**
    * Returns the header or footer on the first page of a section.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait firstPage
    extends StObject
       with HeaderFooterType
  
  /**
    * Returns the header or footer on all pages of a section, but excludes the first page or even pages if they are different.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait primary
    extends StObject
       with HeaderFooterType
}
