package typings.phaser.Phaser.Structs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RBush is a high-performance JavaScript library for 2D spatial indexing of points and rectangles.
  * It's based on an optimized R-tree data structure with bulk insertion support.
  * 
  * Spatial index is a special data structure for points and rectangles that allows you to perform queries like
  * "all items within this bounding box" very efficiently (e.g. hundreds of times faster than looping over all items).
  * 
  * This version of RBush uses a fixed min/max accessor structure of `[ '.left', '.top', '.right', '.bottom' ]`.
  * This is to avoid the eval like function creation that the original library used, which caused CSP policy violations.
  * 
  * rbush is forked from https://github.com/mourner/rbush by Vladimir Agafonkin
  */
trait RTree extends js.Object

