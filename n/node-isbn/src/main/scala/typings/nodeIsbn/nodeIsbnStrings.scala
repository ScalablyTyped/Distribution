package typings.nodeIsbn

import typings.nodeIsbn.mod.isbn.BookLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeIsbnStrings {
  
  @scala.inline
  def BOOK: BOOK = "BOOK".asInstanceOf[BOOK]
  
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  
  @scala.inline
  def isbndb: isbndb = "isbndb".asInstanceOf[isbndb]
  
  @scala.inline
  def openlibrary: openlibrary = "openlibrary".asInstanceOf[openlibrary]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def worldcat: worldcat = "worldcat".asInstanceOf[worldcat]
  
  @js.native
  sealed trait BOOK extends js.Object
  
  @js.native
  sealed trait en extends BookLanguage
  
  @js.native
  sealed trait es extends BookLanguage
  
  @js.native
  sealed trait fr extends BookLanguage
  
  @js.native
  sealed trait google extends js.Object
  
  @js.native
  sealed trait isbndb extends js.Object
  
  @js.native
  sealed trait openlibrary extends js.Object
  
  @js.native
  sealed trait unknown extends BookLanguage
  
  @js.native
  sealed trait worldcat extends js.Object
}
