package typings.nodeIsbn

import typings.nodeIsbn.mod.isbn.BookLanguage
import typings.nodeIsbn.mod.isbn.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeIsbnStrings {
  
  @js.native
  sealed trait BOOK extends StObject
  inline def BOOK: BOOK = "BOOK".asInstanceOf[BOOK]
  
  @js.native
  sealed trait en
    extends StObject
       with BookLanguage
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait es
    extends StObject
       with BookLanguage
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait fr
    extends StObject
       with BookLanguage
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait google
    extends StObject
       with Provider
  inline def google: google = "google".asInstanceOf[google]
  
  @js.native
  sealed trait isbndb
    extends StObject
       with Provider
  inline def isbndb: isbndb = "isbndb".asInstanceOf[isbndb]
  
  @js.native
  sealed trait openlibrary
    extends StObject
       with Provider
  inline def openlibrary: openlibrary = "openlibrary".asInstanceOf[openlibrary]
  
  @js.native
  sealed trait unknown
    extends StObject
       with BookLanguage
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait worldcat
    extends StObject
       with Provider
  inline def worldcat: worldcat = "worldcat".asInstanceOf[worldcat]
}
