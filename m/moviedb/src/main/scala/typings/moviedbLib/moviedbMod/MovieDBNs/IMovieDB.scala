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
    movieImages: js.Function2[
      InfoOptions, 
      js.Function2[/* err */ js.Any, /* images */ MovieImages, scala.Unit], 
      scala.Unit
    ],
    movieInfo: js.Function2[
      InfoOptions, 
      js.Function2[/* err */ js.Any, /* curMovie */ Movie, scala.Unit], 
      scala.Unit
    ],
    searchMovie: js.Function2[
      SearchOptions, 
      js.Function2[/* err */ js.Any, /* movies */ SearchResults, scala.Unit], 
      scala.Unit
    ]
  ): IMovieDB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("movieImages")(movieImages)
    __obj.updateDynamic("movieInfo")(movieInfo)
    __obj.updateDynamic("searchMovie")(searchMovie)
    __obj.asInstanceOf[IMovieDB]
  }
}

