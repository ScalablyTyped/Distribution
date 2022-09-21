package typings.pIteration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-iteration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def every[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def every[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def everySeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def everySeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def filter[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def filter[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def filterSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  inline def filterSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def find[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def find[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def findIndex[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findIndex[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def findIndexSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def findIndexSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def findSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def findSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def forEach[T](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEach[T](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def forEachSeries[T](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEachSeries[T](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def map[T, U](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], U | js.Promise[U]]
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  inline def map[T, U](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], U | js.Promise[U]],
    thisArg: Any
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  
  inline def mapSeries[T, U](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], U | js.Promise[U]]
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  inline def mapSeries[T, U](
    array: js.Array[T],
    callback: js.Function3[/* currentValue */ T, /* index */ Double, /* array */ js.Array[T], U | js.Promise[U]],
    thisArg: Any
  ): js.Promise[js.Array[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[U]]]
  
  inline def reduce[T, U](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ]
  ): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  inline def reduce[T, U](
    array: js.Array[T],
    callback: js.Function4[
      /* accumulator */ U, 
      /* currentValue */ T, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      U | js.Promise[U]
    ],
    initialValue: U
  ): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  inline def some[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def some[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def someSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def someSeries[T](
    array: js.Array[T],
    callback: js.Function3[
      /* currentValue */ T, 
      /* index */ Double, 
      /* array */ js.Array[T], 
      Boolean | js.Promise[Boolean]
    ],
    thisArg: Any
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
