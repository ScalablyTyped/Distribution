package typings.nodeIsbn

import typings.nodeIsbn.nodeIsbnStrings.google
import typings.nodeIsbn.nodeIsbnStrings.isbndb
import typings.nodeIsbn.nodeIsbnStrings.openlibrary
import typings.nodeIsbn.nodeIsbnStrings.worldcat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GOOGLE extends StObject {
    
    var GOOGLE: google
    
    var ISBNDB: isbndb
    
    var OPENLIBRARY: openlibrary
    
    var WORLDCAT: worldcat
  }
  object GOOGLE {
    
    @scala.inline
    def apply(): GOOGLE = {
      val __obj = js.Dynamic.literal(GOOGLE = "google", ISBNDB = "isbndb", OPENLIBRARY = "openlibrary", WORLDCAT = "worldcat")
      __obj.asInstanceOf[GOOGLE]
    }
    
    @scala.inline
    implicit class GOOGLEMutableBuilder[Self <: GOOGLE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGOOGLE(value: google): Self = StObject.set(x, "GOOGLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISBNDB(value: isbndb): Self = StObject.set(x, "ISBNDB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENLIBRARY(value: openlibrary): Self = StObject.set(x, "OPENLIBRARY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWORLDCAT(value: worldcat): Self = StObject.set(x, "WORLDCAT", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmallThumbnail extends StObject {
    
    var smallThumbnail: String
    
    var thumbnail: String
  }
  object SmallThumbnail {
    
    @scala.inline
    def apply(smallThumbnail: String, thumbnail: String): SmallThumbnail = {
      val __obj = js.Dynamic.literal(smallThumbnail = smallThumbnail.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmallThumbnail]
    }
    
    @scala.inline
    implicit class SmallThumbnailMutableBuilder[Self <: SmallThumbnail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmallThumbnail(value: String): Self = StObject.set(x, "smallThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
}
