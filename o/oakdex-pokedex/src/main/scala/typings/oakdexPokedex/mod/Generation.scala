package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generation extends js.Object {
  
  var dex_name: String = js.native
  
  var games: js.Array[Translations] = js.native
  
  var names: Translations = js.native
  
  var number: Double = js.native
}
object Generation {
  
  @scala.inline
  def apply(dex_name: String, games: js.Array[Translations], names: Translations, number: Double): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
  
  @scala.inline
  implicit class GenerationOps[Self <: Generation] (val x: Self) extends AnyVal {
    
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
    def setDex_name(value: String): Self = this.set("dex_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: Translations*): Self = this.set("games", js.Array(value :_*))
    
    @scala.inline
    def setGames(value: js.Array[Translations]): Self = this.set("games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
  }
}
