package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends js.Object {
  
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
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnidbid(value: Double): Self = this.set("anidbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlsite(value: String): Self = this.set("dlsite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_listVarargs(value: String*): Self = this.set("file_list", js.Array(value :_*))
    
    @scala.inline
    def setFile_list(value: js.Array[String]): Self = this.set("file_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesize(value: Double): Self = this.set("filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_scrape(value: String): Self = this.set("last_scrape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeechers(value: Double): Self = this.set("leechers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnet(value: String): Self = this.set("magnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeeders(value: Double): Self = this.set("seeders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_category(value: String): Self = this.set("sub_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Null): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = this.set("torrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_id(value: Double): Self = this.set("uploader_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_name(value: String): Self = this.set("uploader_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploader_old(value: String): Self = this.set("uploader_old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgmdbid(value: Double): Self = this.set("vgmdbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoquality(value: String): Self = this.set("videoquality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVndbid(value: Double): Self = this.set("vndbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite_link(value: String): Self = this.set("website_link", value.asInstanceOf[js.Any])
  }
}
