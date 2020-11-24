package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespacedDebugInput extends js.Object {
  
  /** Set of experiment names to be absolutely forced. These experiments will be forced without evaluating the conditions. */
  var absolutelyForcedExpNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Set of experiment tags to be absolutely forced. The experiments with these tags will be forced without evaluating the conditions. */
  var absolutelyForcedExpTags: js.UndefOr[js.Array[String]] = js.native
  
  /** Set of experiment ids to be absolutely forced. These ids will be forced without evaluating the conditions. */
  var absolutelyForcedExps: js.UndefOr[js.Array[Double]] = js.native
  
  /** Set of experiment names to be conditionally forced. These experiments will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExpNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Set of experiment tags to be conditionally forced. The experiments with these tags will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExpTags: js.UndefOr[js.Array[String]] = js.native
  
  /** Set of experiment ids to be conditionally forced. These ids will be forced only if their conditions and their parent domain's conditions are true. */
  var conditionallyForcedExps: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * If true, disable automatic enrollment selection (at all diversion points). Automatic enrollment selection means experiment selection process based on the experiment's automatic
    * enrollment condition. This does not disable selection of forced experiments.
    */
  var disableAutomaticEnrollmentSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Set of experiment names to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together.
    * If an experiment with an enrollment is disabled, the enrollment is disabled together. If a name corresponds to a domain, the domain itself and all descendant experiments and domains
    * are disabled together.
    */
  var disableExpNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set of experiment tags to be disabled. All experiments that are tagged with one or more of these tags are disabled. If an experiment is disabled, it is never selected nor forced. If
    * an aggregate experiment is disabled, its partitions are disabled together. If an experiment with an enrollment is disabled, the enrollment is disabled together.
    */
  var disableExpTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Set of experiment ids to be disabled. If an experiment is disabled, it is never selected nor forced. If an aggregate experiment is disabled, its partitions are disabled together. If
    * an experiment with an enrollment is disabled, the enrollment is disabled together. If an ID corresponds to a domain, the domain itself and all descendant experiments and domains are
    * disabled together.
    */
  var disableExps: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * If true, disable manual enrollment selection (at all diversion points). Manual enrollment selection means experiment selection process based on the request's manual enrollment
    * states (a.k.a. opt-in experiments). This does not disable selection of forced experiments.
    */
  var disableManualEnrollmentSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, disable organic experiment selection (at all diversion points). Organic selection means experiment selection process based on traffic allocation and diversion condition
    * evaluation. This does not disable selection of forced experiments. This is useful in cases when it is not known whether experiment selection behavior is responsible for a error or
    * breakage. Disabling organic selection may help to isolate the cause of a given problem.
    */
  var disableOrganicSelection: js.UndefOr[Boolean] = js.native
  
  /** Flags to force in a particular experiment state. Map from flag name to flag value. */
  var forcedFlags: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput with TopLevel[js.Any]
  ] = js.native
  
  /** Rollouts to force in a particular experiment state. Map from rollout name to rollout value. */
  var forcedRollouts: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: boolean}
    */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput with TopLevel[js.Any]
  ] = js.native
}
object NamespacedDebugInput {
  
  @scala.inline
  def apply(): NamespacedDebugInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespacedDebugInput]
  }
  
  @scala.inline
  implicit class NamespacedDebugInputOps[Self <: NamespacedDebugInput] (val x: Self) extends AnyVal {
    
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
    def setAbsolutelyForcedExpNamesVarargs(value: String*): Self = this.set("absolutelyForcedExpNames", js.Array(value :_*))
    
    @scala.inline
    def setAbsolutelyForcedExpNames(value: js.Array[String]): Self = this.set("absolutelyForcedExpNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutelyForcedExpNames: Self = this.set("absolutelyForcedExpNames", js.undefined)
    
    @scala.inline
    def setAbsolutelyForcedExpTagsVarargs(value: String*): Self = this.set("absolutelyForcedExpTags", js.Array(value :_*))
    
    @scala.inline
    def setAbsolutelyForcedExpTags(value: js.Array[String]): Self = this.set("absolutelyForcedExpTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutelyForcedExpTags: Self = this.set("absolutelyForcedExpTags", js.undefined)
    
    @scala.inline
    def setAbsolutelyForcedExpsVarargs(value: Double*): Self = this.set("absolutelyForcedExps", js.Array(value :_*))
    
    @scala.inline
    def setAbsolutelyForcedExps(value: js.Array[Double]): Self = this.set("absolutelyForcedExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutelyForcedExps: Self = this.set("absolutelyForcedExps", js.undefined)
    
    @scala.inline
    def setConditionallyForcedExpNamesVarargs(value: String*): Self = this.set("conditionallyForcedExpNames", js.Array(value :_*))
    
    @scala.inline
    def setConditionallyForcedExpNames(value: js.Array[String]): Self = this.set("conditionallyForcedExpNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionallyForcedExpNames: Self = this.set("conditionallyForcedExpNames", js.undefined)
    
    @scala.inline
    def setConditionallyForcedExpTagsVarargs(value: String*): Self = this.set("conditionallyForcedExpTags", js.Array(value :_*))
    
    @scala.inline
    def setConditionallyForcedExpTags(value: js.Array[String]): Self = this.set("conditionallyForcedExpTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionallyForcedExpTags: Self = this.set("conditionallyForcedExpTags", js.undefined)
    
    @scala.inline
    def setConditionallyForcedExpsVarargs(value: Double*): Self = this.set("conditionallyForcedExps", js.Array(value :_*))
    
    @scala.inline
    def setConditionallyForcedExps(value: js.Array[Double]): Self = this.set("conditionallyForcedExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionallyForcedExps: Self = this.set("conditionallyForcedExps", js.undefined)
    
    @scala.inline
    def setDisableAutomaticEnrollmentSelection(value: Boolean): Self = this.set("disableAutomaticEnrollmentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutomaticEnrollmentSelection: Self = this.set("disableAutomaticEnrollmentSelection", js.undefined)
    
    @scala.inline
    def setDisableExpNamesVarargs(value: String*): Self = this.set("disableExpNames", js.Array(value :_*))
    
    @scala.inline
    def setDisableExpNames(value: js.Array[String]): Self = this.set("disableExpNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExpNames: Self = this.set("disableExpNames", js.undefined)
    
    @scala.inline
    def setDisableExpTagsVarargs(value: String*): Self = this.set("disableExpTags", js.Array(value :_*))
    
    @scala.inline
    def setDisableExpTags(value: js.Array[String]): Self = this.set("disableExpTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExpTags: Self = this.set("disableExpTags", js.undefined)
    
    @scala.inline
    def setDisableExpsVarargs(value: Double*): Self = this.set("disableExps", js.Array(value :_*))
    
    @scala.inline
    def setDisableExps(value: js.Array[Double]): Self = this.set("disableExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExps: Self = this.set("disableExps", js.undefined)
    
    @scala.inline
    def setDisableManualEnrollmentSelection(value: Boolean): Self = this.set("disableManualEnrollmentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableManualEnrollmentSelection: Self = this.set("disableManualEnrollmentSelection", js.undefined)
    
    @scala.inline
    def setDisableOrganicSelection(value: Boolean): Self = this.set("disableOrganicSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOrganicSelection: Self = this.set("disableOrganicSelection", js.undefined)
    
    @scala.inline
    def setForcedFlags(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput with TopLevel[js.Any]
    ): Self = this.set("forcedFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcedFlags: Self = this.set("forcedFlags", js.undefined)
    
    @scala.inline
    def setForcedRollouts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: boolean}
      */ typings.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.NamespacedDebugInput with TopLevel[js.Any]
    ): Self = this.set("forcedRollouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcedRollouts: Self = this.set("forcedRollouts", js.undefined)
  }
}
