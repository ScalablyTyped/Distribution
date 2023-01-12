package typings.oslicense

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oslicense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLicenseData(id: String): js.Promise[License] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseData")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[License]]
  
  inline def getLicenseText(id: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseText")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getLicenses(): js.Promise[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLicenses")().asInstanceOf[js.Promise[Record[String, String]]]
  
  inline def getNearestLicense(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNearestLicense")().asInstanceOf[String]
  
  trait Identifier extends StObject {
    
    var identifier: String
    
    var scheme: String
  }
  object Identifier {
    
    inline def apply(identifier: String, scheme: String): Identifier = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  trait License extends StObject {
    
    var id: String
    
    var identifiers: js.Array[Identifier]
    
    var keywords: js.Array[String]
    
    var links: js.Array[Link]
    
    var name: String
    
    var other_names: js.Array[OtherName]
    
    var superseded_by: Null | String
    
    var text: js.Array[Text]
  }
  object License {
    
    inline def apply(
      id: String,
      identifiers: js.Array[Identifier],
      keywords: js.Array[String],
      links: js.Array[Link],
      name: String,
      other_names: js.Array[OtherName],
      text: js.Array[Text]
    ): License = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], other_names = other_names.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], superseded_by = null)
      __obj.asInstanceOf[License]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: License] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value*))
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOther_names(value: js.Array[OtherName]): Self = StObject.set(x, "other_names", value.asInstanceOf[js.Any])
      
      inline def setOther_namesVarargs(value: OtherName*): Self = StObject.set(x, "other_names", js.Array(value*))
      
      inline def setSuperseded_by(value: String): Self = StObject.set(x, "superseded_by", value.asInstanceOf[js.Any])
      
      inline def setSuperseded_byNull: Self = StObject.set(x, "superseded_by", null)
      
      inline def setText(value: js.Array[Text]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: Text*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
  
  trait Link extends StObject {
    
    var note: String
    
    var url: String
  }
  object Link {
    
    inline def apply(note: String, url: String): Link = {
      val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait OtherName extends StObject {
    
    var name: String
    
    var note: String
  }
  object OtherName {
    
    inline def apply(name: String, note: String): OtherName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OtherName] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var media_type: String
    
    var title: String
    
    var url: String
  }
  object Text {
    
    inline def apply(media_type: String, title: String, url: String): Text = {
      val __obj = js.Dynamic.literal(media_type = media_type.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setMedia_type(value: String): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
