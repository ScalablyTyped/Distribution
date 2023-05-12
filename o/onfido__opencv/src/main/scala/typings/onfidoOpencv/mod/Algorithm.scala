package typings.onfidoOpencv.mod

import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "Algorithm")
@js.native
open class Algorithm ()
  extends typings.mirada.mod.Algorithm
/* static members */
object Algorithm {
  
  @JSImport("@onfido/opencv", "Algorithm")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
    *
    *   ```cpp
    *   Ptr<SVM> svm = Algorithm::load<SVM>("my_svm_model.xml");
    *   ```
    *
    *    In order to make this method work, the derived class must overwrite [Algorithm::read](const
    * [FileNode]& fn).
    *
    * @param filename Name of the file to read.
    *
    * @param objname The optional name of the node to read (if empty, the first top-level node will be
    * used)
    */
  inline def load(arg0: Any, filename: String): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(arg0.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Ptr]
  inline def load(arg0: Any, filename: String, objname: String): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(arg0.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], objname.asInstanceOf[js.Any])).asInstanceOf[Ptr]
  
  /**
    *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
    *
    *   ```cpp
    *   Ptr<SVM> svm = Algorithm::loadFromString<SVM>(myStringModel);
    *   ```
    *
    * @param strModel The string variable containing the model you want to load.
    *
    * @param objname The optional name of the node to read (if empty, the first top-level node will be
    * used)
    */
  inline def loadFromString(arg1: Any, strModel: String): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromString")(arg1.asInstanceOf[js.Any], strModel.asInstanceOf[js.Any])).asInstanceOf[Ptr]
  inline def loadFromString(arg1: Any, strModel: String, objname: String): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromString")(arg1.asInstanceOf[js.Any], strModel.asInstanceOf[js.Any], objname.asInstanceOf[js.Any])).asInstanceOf[Ptr]
  
  /**
    *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
    *
    *   ```cpp
    *   cv::FileStorage fsRead("example.xml", FileStorage::READ);
    *   Ptr<SVM> svm = Algorithm::read<SVM>(fsRead.root());
    *   ```
    *
    *    In order to make this method work, the derived class must overwrite [Algorithm::read](const
    * [FileNode]& fn) and also have static create() method without parameters (or with all the optional
    * parameters)
    */
  inline def read(arg2: Any, fn: FileNode): Ptr = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(arg2.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Ptr]
}
