package typings.nodeIsbn

import typings.nodeIsbn.mod.isbn.BookLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeIsbnStrings {
  
  @js.native
  sealed trait BOOK extends StObject
  @scala.inline
  def BOOK: BOOK = "BOOK".asInstanceOf[BOOK]
  
  @js.native
  sealed trait en extends BookLanguage
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait es extends BookLanguage
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait fr extends BookLanguage
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait google extends StObject
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  
  @js.native
  sealed trait isbndb extends StObject
  @scala.inline
  def isbndb: isbndb = "isbndb".asInstanceOf[isbndb]
  
  @js.native
  sealed trait openlibrary extends StObject
  @scala.inline
  def openlibrary: openlibrary = "openlibrary".asInstanceOf[openlibrary]
  
  @js.native
  sealed trait unknown extends BookLanguage
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait worldcat extends StObject
  @scala.inline
  def worldcat: worldcat = "worldcat".asInstanceOf[worldcat]
}
