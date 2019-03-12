package typings
package moviedbLib.moviedbMod.MovieDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMovieDB extends js.Object {
  def movieImages(
    options: InfoOptions,
    callback: js.Function2[/* err */ js.Any, /* images */ MovieImages, scala.Unit]
  ): scala.Unit
  def movieInfo(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* curMovie */ Movie, scala.Unit]): scala.Unit
  def searchMovie(
    params: SearchOptions,
    callback: js.Function2[/* err */ js.Any, /* movies */ SearchResults, scala.Unit]
  ): scala.Unit
}

object IMovieDB {
  @scala.inline
  def apply(
    movieImages: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, scala.Unit]) => scala.Unit,
    movieInfo: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, scala.Unit]) => scala.Unit,
    searchMovie: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, scala.Unit]) => scala.Unit
  ): IMovieDB = {
    val __obj = js.Dynamic.literal(movieImages = js.Any.fromFunction2(movieImages), movieInfo = js.Any.fromFunction2(movieInfo), searchMovie = js.Any.fromFunction2(searchMovie))
  
    __obj.asInstanceOf[IMovieDB]
  }
}

