package typings.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMovieDB extends js.Object {
  
  def movieImages(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]): Unit = js.native
  
  def movieInfo(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]): Unit = js.native
  
  def searchMovie(params: SearchOptions, callback: js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]): Unit = js.native
}
object IMovieDB {
  
  @scala.inline
  def apply(
    movieImages: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Unit,
    movieInfo: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Unit,
    searchMovie: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Unit
  ): IMovieDB = {
    val __obj = js.Dynamic.literal(movieImages = js.Any.fromFunction2(movieImages), movieInfo = js.Any.fromFunction2(movieInfo), searchMovie = js.Any.fromFunction2(searchMovie))
    __obj.asInstanceOf[IMovieDB]
  }
  
  @scala.inline
  implicit class IMovieDBOps[Self <: IMovieDB] (val x: Self) extends AnyVal {
    
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
    def setMovieImages(value: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Unit): Self = this.set("movieImages", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMovieInfo(value: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Unit): Self = this.set("movieInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchMovie(value: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Unit): Self = this.set("searchMovie", js.Any.fromFunction2(value))
  }
}
