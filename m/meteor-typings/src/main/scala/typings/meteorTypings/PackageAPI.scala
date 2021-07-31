package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable0
import typings.meteorTypings.anon.Bare
import typings.meteorTypings.anon.Unordered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageAPI
  extends StObject
     with Instantiable0[PackageAPI] {
  
  def addAssets(filenames: String, architecture: String): Unit = js.native
  def addAssets(filenames: String, architecture: js.Array[String]): Unit = js.native
  def addAssets(filenames: js.Array[String], architecture: String): Unit = js.native
  def addAssets(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
  
  def addFiles(filenames: String): Unit = js.native
  def addFiles(filenames: String, architecture: String): Unit = js.native
  def addFiles(filenames: String, architecture: String, options: Bare): Unit = js.native
  def addFiles(filenames: String, architecture: js.Array[String]): Unit = js.native
  def addFiles(filenames: String, architecture: js.Array[String], options: Bare): Unit = js.native
  def addFiles(filenames: String, architecture: Unit, options: Bare): Unit = js.native
  def addFiles(filenames: js.Array[String]): Unit = js.native
  def addFiles(filenames: js.Array[String], architecture: String): Unit = js.native
  def addFiles(filenames: js.Array[String], architecture: String, options: Bare): Unit = js.native
  def addFiles(filenames: js.Array[String], architecture: js.Array[String]): Unit = js.native
  def addFiles(filenames: js.Array[String], architecture: js.Array[String], options: Bare): Unit = js.native
  def addFiles(filenames: js.Array[String], architecture: Unit, options: Bare): Unit = js.native
  
  def `export`(exportedObjects: String): Unit = js.native
  def `export`(exportedObjects: String, architecture: String): Unit = js.native
  def `export`(exportedObjects: String, architecture: String, exportOptions: js.Object): Unit = js.native
  def `export`(exportedObjects: String, architecture: String, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: String, architecture: String, exportOptions: Unit, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: String, architecture: js.Array[String]): Unit = js.native
  def `export`(exportedObjects: String, architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
  def `export`(
    exportedObjects: String,
    architecture: js.Array[String],
    exportOptions: js.Object,
    testOnly: Boolean
  ): Unit = js.native
  def `export`(exportedObjects: String, architecture: js.Array[String], exportOptions: Unit, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: String, architecture: Unit, exportOptions: js.Object): Unit = js.native
  def `export`(exportedObjects: String, architecture: Unit, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: String, architecture: Unit, exportOptions: Unit, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: js.Array[String]): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: String): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: String, exportOptions: js.Object): Unit = js.native
  def `export`(
    exportedObjects: js.Array[String],
    architecture: String,
    exportOptions: js.Object,
    testOnly: Boolean
  ): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: String, exportOptions: Unit, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: js.Array[String]): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: js.Array[String], exportOptions: js.Object): Unit = js.native
  def `export`(
    exportedObjects: js.Array[String],
    architecture: js.Array[String],
    exportOptions: js.Object,
    testOnly: Boolean
  ): Unit = js.native
  def `export`(
    exportedObjects: js.Array[String],
    architecture: js.Array[String],
    exportOptions: Unit,
    testOnly: Boolean
  ): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: js.Object): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: js.Object, testOnly: Boolean): Unit = js.native
  def `export`(exportedObjects: js.Array[String], architecture: Unit, exportOptions: Unit, testOnly: Boolean): Unit = js.native
  
  def imply(packageNames: String): Unit = js.native
  def imply(packageNames: String, architecture: String): Unit = js.native
  def imply(packageNames: String, architecture: js.Array[String]): Unit = js.native
  def imply(packageNames: js.Array[String]): Unit = js.native
  def imply(packageNames: js.Array[String], architecture: String): Unit = js.native
  def imply(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
  
  def use(packageNames: String): Unit = js.native
  def use(packageNames: String, architecture: String): Unit = js.native
  def use(packageNames: String, architecture: String, options: Unordered): Unit = js.native
  def use(packageNames: String, architecture: js.Array[String]): Unit = js.native
  def use(packageNames: String, architecture: js.Array[String], options: Unordered): Unit = js.native
  def use(packageNames: String, architecture: Unit, options: Unordered): Unit = js.native
  def use(packageNames: js.Array[String]): Unit = js.native
  def use(packageNames: js.Array[String], architecture: String): Unit = js.native
  def use(packageNames: js.Array[String], architecture: String, options: Unordered): Unit = js.native
  def use(packageNames: js.Array[String], architecture: js.Array[String]): Unit = js.native
  def use(packageNames: js.Array[String], architecture: js.Array[String], options: Unordered): Unit = js.native
  def use(packageNames: js.Array[String], architecture: Unit, options: Unordered): Unit = js.native
  
  def versionsFrom(meteorRelease: String): Unit = js.native
  def versionsFrom(meteorRelease: js.Array[String]): Unit = js.native
}
