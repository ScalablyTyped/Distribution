package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderFooterType extends StObject
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.HeaderFooterType")
@js.native
object HeaderFooterType extends StObject {
  
  /**
    * Returns all headers or footers on even-numbered pages of a section.
    *
    */
  @js.native
  sealed trait evenPages
    extends StObject
       with HeaderFooterType
  
  /**
    * Returns the header or footer on the first page of a section.
    *
    */
  @js.native
  sealed trait firstPage
    extends StObject
       with HeaderFooterType
  
  /**
    * Returns the header or footer on all pages of a section, but excludes the first page or odd pages if they are different.
    *
    */
  @js.native
  sealed trait primary
    extends StObject
       with HeaderFooterType
}
