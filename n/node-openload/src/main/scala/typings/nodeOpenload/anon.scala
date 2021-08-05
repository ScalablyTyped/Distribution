package typings.nodeOpenload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Added extends StObject {
    
    var added: String
    
    var bytes_loaded: String
    
    var bytes_total: String
    
    var extid: String | Boolean
    
    var folderid: String
    
    var id: Double
    
    var last_update: String
    
    var remoteurl: String
    
    var status: String
    
    var url: String | Boolean
  }
  object Added {
    
    inline def apply(
      added: String,
      bytes_loaded: String,
      bytes_total: String,
      extid: String | Boolean,
      folderid: String,
      id: Double,
      last_update: String,
      remoteurl: String,
      status: String,
      url: String | Boolean
    ): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], bytes_loaded = bytes_loaded.asInstanceOf[js.Any], bytes_total = bytes_total.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], remoteurl = remoteurl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    extension [Self <: Added](x: Self) {
      
      inline def setAdded(value: String): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setBytes_loaded(value: String): Self = StObject.set(x, "bytes_loaded", value.asInstanceOf[js.Any])
      
      inline def setBytes_total(value: String): Self = StObject.set(x, "bytes_total", value.asInstanceOf[js.Any])
      
      inline def setExtid(value: String | Boolean): Self = StObject.set(x, "extid", value.asInstanceOf[js.Any])
      
      inline def setFolderid(value: String): Self = StObject.set(x, "folderid", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_update(value: String): Self = StObject.set(x, "last_update", value.asInstanceOf[js.Any])
      
      inline def setRemoteurl(value: String): Self = StObject.set(x, "remoteurl", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String | Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contenttype extends StObject {
    
    var content_type: String
    
    var id: String
    
    var name: String
    
    var sha1: String
    
    var size: Double
    
    var status: Double
  }
  object Contenttype {
    
    inline def apply(content_type: String, id: String, name: String, sha1: String, size: Double, status: Double): Contenttype = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contenttype]
    }
    
    extension [Self <: Contenttype](x: Self) {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cstatus extends StObject {
    
    var content_type: String
    
    var cstatus: String
    
    var download_count: String
    
    var folderid: String
    
    var link: String
    
    var linkextid: String
    
    var name: String
    
    var sha1: String
    
    var size: String
    
    var status: String
    
    var upload_at: String
  }
  object Cstatus {
    
    inline def apply(
      content_type: String,
      cstatus: String,
      download_count: String,
      folderid: String,
      link: String,
      linkextid: String,
      name: String,
      sha1: String,
      size: String,
      status: String,
      upload_at: String
    ): Cstatus = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], cstatus = cstatus.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cstatus]
    }
    
    extension [Self <: Cstatus](x: Self) {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setCstatus(value: String): Self = StObject.set(x, "cstatus", value.asInstanceOf[js.Any])
      
      inline def setDownload_count(value: String): Self = StObject.set(x, "download_count", value.asInstanceOf[js.Any])
      
      inline def setFolderid(value: String): Self = StObject.set(x, "folderid", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkextid(value: String): Self = StObject.set(x, "linkextid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUpload_at(value: String): Self = StObject.set(x, "upload_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var name: String
  }
  object Id {
    
    inline def apply(id: String, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var used_24h: Double
  }
  object Left {
    
    inline def apply(left: Double, used_24h: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], used_24h = used_24h.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setUsed_24h(value: Double): Self = StObject.set(x, "used_24h", value.asInstanceOf[js.Any])
    }
  }
}
