package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVerifyVaultJob extends js.Object {
  val FixErrors: Boolean = js.native
  val VaultGUID: String = js.native
  val VerifyFileContents: Boolean = js.native
  def Clone(): IVerifyVaultJob = js.native
  def GetNumberOfSteps(): Double = js.native
  def GetOneBasedIndexOfStep(CurrentStep: Double): Double = js.native
  def GetStepProgressText(CurrentStep: Double): String = js.native
  def Set(GuidVault: String, FixErrors: Boolean, VerifyFileContents: Boolean): Unit = js.native
}

object IVerifyVaultJob {
  @scala.inline
  def apply(
    Clone: () => IVerifyVaultJob,
    FixErrors: Boolean,
    GetNumberOfSteps: () => Double,
    GetOneBasedIndexOfStep: Double => Double,
    GetStepProgressText: Double => String,
    Set: (String, Boolean, Boolean) => Unit,
    VaultGUID: String,
    VerifyFileContents: Boolean
  ): IVerifyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FixErrors = FixErrors.asInstanceOf[js.Any], GetNumberOfSteps = js.Any.fromFunction0(GetNumberOfSteps), GetOneBasedIndexOfStep = js.Any.fromFunction1(GetOneBasedIndexOfStep), GetStepProgressText = js.Any.fromFunction1(GetStepProgressText), Set = js.Any.fromFunction3(Set), VaultGUID = VaultGUID.asInstanceOf[js.Any], VerifyFileContents = VerifyFileContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyVaultJob]
  }
  @scala.inline
  implicit class IVerifyVaultJobOps[Self <: IVerifyVaultJob] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IVerifyVaultJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setFixErrors(value: Boolean): Self = this.set("FixErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNumberOfSteps(value: () => Double): Self = this.set("GetNumberOfSteps", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOneBasedIndexOfStep(value: Double => Double): Self = this.set("GetOneBasedIndexOfStep", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStepProgressText(value: Double => String): Self = this.set("GetStepProgressText", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, Boolean, Boolean) => Unit): Self = this.set("Set", js.Any.fromFunction3(value))
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerifyFileContents(value: Boolean): Self = this.set("VerifyFileContents", value.asInstanceOf[js.Any])
  }
  
}

