package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends StObject {
  
  var anidbid: Double = js.native
  
  var category: String = js.native
  
  var comments: js.Array[Comment] = js.native
  
  var completed: Double = js.native
  
  var date: String = js.native
  
  var description: String = js.native
  
  var dlsite: String = js.native
  
  var file_list: js.Array[String] = js.native
  
  var filesize: Double = js.native
  
  var hash: String = js.native
  
  var id: Double = js.native
  
  var languages: js.Array[String] = js.native
  
  var last_scrape: String = js.native
  
  var leechers: Double = js.native
  
  var magnet: String = js.native
  
  var name: String = js.native
  
  var seeders: Double = js.native
  
  var status: Double = js.native
  
  var sub_category: String = js.native
  
  var tags: Null = js.native
  
  var torrent: String = js.native
  
  var uploader_id: Double = js.native
  
  var uploader_name: String = js.native
  
  var uploader_old: String = js.native
  
  var vgmdbid: Double = js.native
  
  var videoquality: String = js.native
  
  var vndbid: Double = js.native
  
  var website_link: String = js.native
}
object Torrent {
  
  @scala.inline
  def apply(
    anidbid: Double,
    category: String,
    comments: js.Array[Comment],
    completed: Double,
    date: String,
    description: String,
    dlsite: String,
    file_list: js.Array[String],
    filesize: Double,
    hash: String,
    id: Double,
    languages: js.Array[String],
    last_scrape: String,
    leechers: Double,
    magnet: String,
    name: String,
    seeders: Double,
    status: Double,
    sub_category: String,
    tags: Null,
    torrent: String,
    uploader_id: Double,
    uploader_name: String,
    uploader_old: String,
    vgmdbid: Double,
    videoquality: String,
    vndbid: Double,
    website_link: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(anidbid = anidbid.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dlsite = dlsite.asInstanceOf[js.Any], file_list = file_list.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], last_scrape = last_scrape.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], uploader_id = uploader_id.asInstanceOf[js.Any], uploader_name = uploader_name.asInstanceOf[js.Any], uploader_old = uploader_old.asInstanceOf[js.Any], vgmdbid = vgmdbid.asInstanceOf[js.Any], videoquality = videoquality.asInstanceOf[js.Any], vndbid = vndbid.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  
  @scala.inline
  implicit class TorrentMutableBuilder[Self <: Torrent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnidbid(value: Double): Self = StObject.set(x, "anidbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlsite(value: String): Self = StObject.set(x, "dlsite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_list(value: js.Array[String]): Self = StObject.set(x, "file_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_listVarargs(value: String*): Self = StObject.set(x, "file_list", js.Array(value :_*))
    
    @scala.inline
    def setFilesize(value: Double): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setLast_scrape(value: String): Self = StObject.set(x, "last_scrape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeechers(value: Double): Self = StObject.set(x, "leechers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeeders(value: Double): Self = StObject.set(x, "seeders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_category(value: String): Self = StObject.set(x, "sub_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Null): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_id(value: Double): Self = StObject.set(x, "uploader_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_name(value: String): Self = StObject.set(x, "uploader_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_old(value: String): Self = StObject.set(x, "uploader_old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgmdbid(value: Double): Self = StObject.set(x, "vgmdbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoquality(value: String): Self = StObject.set(x, "videoquality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVndbid(value: Double): Self = StObject.set(x, "vndbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite_link(value: String): Self = StObject.set(x, "website_link", value.asInstanceOf[js.Any])
  }
}
